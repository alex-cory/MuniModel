package com.AleXander;

public class Stop extends MuniObject
{
    int stopID;
    String Location;

    Stop (int stopID, String Location)
    {
         this.stopID = stopID;
         this.Location = Location;
    }

    public int getStopID(){
        return this.stopID;
    }
}