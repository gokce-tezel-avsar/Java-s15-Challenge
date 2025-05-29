package com.library.person;

import java.time.LocalDate;

public abstract class Person { //Reader ve Librarian persondan türetlecek
   private String id;
   private String firstName;
   private String lastName;
   private String email;
   private String password; //ikiside üye olmalı


   public Person(String id, String firstName, String lastName, String email, String password) {
      this.id = id;
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.password = password;

   }

   public String getId() {
      return id;
   }

   public String getLastName() {
      return lastName;
   }

   public String getFirstName() {
      return firstName;
   }

   public String getEmail() {
      return email;
   }

   public String getPassword() {
      return password;
   }


   public void setId(String id) {
      this.id = id;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public void setEmail(String email) {
      this.email = email;
   }
   public abstract String whoYouAre(); // subclasslarda bunu override ederek personun typeini yazacağız
}