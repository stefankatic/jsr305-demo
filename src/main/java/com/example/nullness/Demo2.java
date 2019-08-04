//package com.example.nullness;
//
//import org.eclipse.jdt.annotation.NonNullByDefault;
//import org.eclipse.jdt.annotation.Nullable;
//
//@NonNullByDefault
//public class Demo2 {
//
//  private String a;
//  @Nullable
//  private String b;
//
//  public Demo2() {
//    a = "Not null";
//  }
//  public void run() {
//    System.out.println(a.toLowerCase());
//    System.out.println(b.toLowerCase());
//  }
//  public void using() {
//    System.out.println(b); //OK
//    System.out.println(null == b); //OK
//    if (null != b) {
//      System.out.println(b.toLowerCase()); //OK
//    }
//  }
//
//}
