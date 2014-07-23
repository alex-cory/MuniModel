/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Iris
 */
import java.util.ArrayList;
public class Route extends MuniObject{
    ArrayList<TransferStop> TransferStops = new ArrayList<>();
    ArrayList<Reg> RegStops = new ArrayList<>();
    int startID;
    int endID;
    Vehicle[] vehicleOjs;

    public Route(String vehicleType){

    }
    public boolean contains(int stopID) {
        boolean contains = false;
        for(int i = 0; i < RegStops.size(); i++) {
            if(RegStops.get(i) == stopID){
                 contains = true;
            }
        }
        if(contains){
            for(int i = 0; i < transferStops.size(); i++){
                if(TransferStops.get(i) == stopID){
                    contains = true
                }
            }
        }
        return contains;

    }
}
