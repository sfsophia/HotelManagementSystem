/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Beans.Room;
import java.util.ArrayList;
import Beans.Food;
/**
 *
 * @author User
 */
public class SingleRoom extends Room{
     public ArrayList<Food> food =new ArrayList<>();
    
    public SingleRoom(String name, String contact, String gender) {
        super(name, contact, gender);
    }
    
}
