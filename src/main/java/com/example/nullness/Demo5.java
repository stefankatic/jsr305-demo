package com.example.nullness;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;

@NonNullByDefault
public class Demo5 {

  @Nullable private User user;

  public Demo5(@Nullable User user) {
    this.user = user;
  }

  public void overlyComplexCode() {
    User u = this.user;
    if (u != null) {
      u.doSquats();
      if (u.isExpired()) {
        System.out.println("Expired");
      }
    }
    // other instructions

    if (u != null) {
      u.makeCode();
    }
  }
}
