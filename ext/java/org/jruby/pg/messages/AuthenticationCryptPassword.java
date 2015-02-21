package org.jruby.pg.messages;

public class AuthenticationCryptPassword extends BackendMessage {
  public AuthenticationCryptPassword(byte[] salt) {
    if(salt.length != 2) {
      throw new IllegalArgumentException("argument must be a 2 byte array");
    }
  }

  @Override
  public MessageType getType() {
    return MessageType.AuthenticationCryptPassword;
  }
}
