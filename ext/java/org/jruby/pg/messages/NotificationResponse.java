package org.jruby.pg.messages;

public class NotificationResponse extends BackendMessage {
  private final int pid;
  private final String condition;
  private final String payload;

  public NotificationResponse(int pid, String condition, String payload) {
    this.pid = pid;
    this.condition = condition;
    this.payload = payload;
  }

  @Override
  public MessageType getType() {
    return MessageType.NotificationResponse;
  }

  public int getPid() {
    return pid;
  }

  public String getCondition() {
    return condition;
  }

  public String getPayload() {
    // the mri wrapper returns null if the payload is empty
    if(payload.isEmpty()) {
      return null;
    }

    return payload;
  }
}
