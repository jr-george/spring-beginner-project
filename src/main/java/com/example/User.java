package com.example;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value; //Esta es la libreria que me pedia el compilador
public class User {
   @Value("Beto")
   private String name;
   @Value("Jarillo")
   private String lastName;
   @Value("10/30/1986")
   private Date birthDate;
   
   
   //Setters and getters methods
   public void setName(String name)
   {
      this.name=name;
   }
   
   public void setLastName (String lastName){
      this.lastName=lastName;
   }
   
   public void setBirthDate(Date birthDate){
      this.birthDate=birthDate;
   }
   
   public String getName(){
      return this.name;
   }
   
   public String getLastName (){
      return this.lastName;
   }
   
   public Date getBirthDate(){
      return this.birthDate;
   }
}
