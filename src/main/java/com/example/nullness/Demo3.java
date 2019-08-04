package com.example.nullness;


import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;

@NonNullByDefault
public class Demo3 {

  @Nullable
  private String nullable;

  @Nullable
  public String getNullable() {
    return nullable;
  }

  public static void notCompiling() {
    Demo3 demo = new Demo3();

      if (demo.getNullable() != null) {
        // do something with it.
        System.out.println(demo.getNullable().toLowerCase());
      }

      // 5 lines later
      if (demo.getNullable() != null) {
        // do something with it.
        System.out.println(demo.getNullable().toLowerCase());
      }

      // 10 lines later
      if (demo.getNullable() != null) {
        // do something with it.
        System.out.println(demo.getNullable().toLowerCase());
      }
  }


}
