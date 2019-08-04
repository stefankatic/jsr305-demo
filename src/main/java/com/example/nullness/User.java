package com.example.nullness;

import org.eclipse.jdt.annotation.NonNullByDefault;

@NonNullByDefault
public class User {

  private boolean expired;

  public boolean isExpired() {
    return expired;
  }

  public void doSquats() {
    System.out.println("Doing squats.");
  }

  public void makeCode() {

  }
}
