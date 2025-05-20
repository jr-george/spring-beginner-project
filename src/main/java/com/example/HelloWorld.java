package com.example;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorld {
   @Autowired
   private User user;
   public void sayHello () {
      //System.out.println("Hello World!");
      
      System.out.printf("%s, %s %s %s", "Hello", user.getName(), user.getLastName(), user.getBirthDate());
   }
}