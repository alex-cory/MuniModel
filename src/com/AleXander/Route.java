/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Iris
 */
package com.AleXander;

import com.AleXander.MuniObject;
import com.AleXander.TransferStop;


import java.util.ArrayList;
public class Route extends MuniObject {
    ArrayList<TransferStop> transferStops = new ArrayList<TransferStop>();
    ArrayList<RegularStop> regStops = new ArrayList<RegularStop>();
    int startID;
    int endID;
    Vehicle[] vehicleOjs;

    public Route(String vehicleType){

    }
//    public boolean contains(int stopID) {
//        boolean contains = false;
//        for(int i = 0; i < regStops.size(); i++) {
//            if(regStops.get(i) == stopID){
//                 contains = true;
//            }
//        }
//        if(contains){
//            for(int i = 0; i < transferStops.size(); i++){
//                if(transferStops.get(i) == stopID){
//                    contains = true;
//                }
//            }
//        }
//        return contains;
//    }
}
