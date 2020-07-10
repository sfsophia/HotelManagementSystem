/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Beans.Food;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Room {

   String name;
    String contact;
    String gender;   
    

    public Room(String name, String contact, String gender) {
        this.name = name;
        this.contact = contact;
        this.gender = gender;
      
    }

   
    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
   
}
