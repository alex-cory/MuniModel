/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Iris
 */
public class Vehicle extends MuniObject{
    Passenger[] pass;
    Driver driver;
    char direction;
    public Vehicle(Driver d, char dir){
        driver = d;
        pass = new Passenger[20];
        direction = dir;
    }
}
