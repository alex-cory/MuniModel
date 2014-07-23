/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.AleXander.Vehicle;

/**
 *
 * @author Iris
 */
public class Bus extends Vehicle {
    // Properties
    public int stopID;
    public Bus() {
//        super(Driver d, char dir);
    }
    public int getCurrentStop() {
        return stopID;
    }
}
