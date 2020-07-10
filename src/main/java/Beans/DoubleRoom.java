/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.util.ArrayList;
import Beans.Food;
import Beans.Room;
/**
 *
 * @author User
 */
public class DoubleRoom extends SingleRoom{
    
     String name2;
    String contact2;
    String gender2;  
    public ArrayList<Food> food =new ArrayList<>();

    public DoubleRoom(String name, String contact, String gender) {
        super(name, contact, gender);
        
    }
    
    
    public DoubleRoom(String name,String contact,String gender,String name2,String contact2,String gender2)
    {
        super(name, contact, gender);
        this.name2=name2;
        this.contact2=contact2;
        this.gender2=gender2;
    }

  
}
