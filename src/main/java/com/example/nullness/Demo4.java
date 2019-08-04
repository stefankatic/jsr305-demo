package com.example.nullness;


import static java.lang.Math.random;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;

@NonNullByDefault
public class Demo4 {

  @Nullable
  private String nullable;

  @Nullable
  public String getNullable() {
    return nullable;
  }

  public void assignAndCompile() {
      if(random() >= 0.5) {
        nullable = "string";
      }
      if (nullable != null) {
        // do something with it.
        System.out.println(nullable.toLowerCase());
      }

      // 5 lines later
      if (nullable != null) {
        // do something with it.
        System.out.println(nullable.toLowerCase());
      }

      // 10 lines later
      if (nullable != null) {
        // do something with it.
        System.out.println(nullable.toLowerCase());
      }
  }


}
