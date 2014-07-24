package com.AleXander;

import java.io.*;
import java.util.ArrayList;
import java.io.BufferedReader;

public class Main {


//    private static Scanner bayshoreInputStream;

    public static void main(String[] args) {
        // Setting the file variables
        String bayshoreFile = "./8xBayshore.csv"; // bus
        String vanNessFile = "./47VanNess.csv"; // bus
        String missionFile = "./49mission.csv"; // bus
        String kInglesideFile = "./KIngleside.csv"; // LRV
        String lTaravalFile = "./LTaraval.csv"; // LRV
        String nJudahFile = "./NJudah.csv"; // LRV
        String tThird = "./TThird.csv"; // LRV
        String passengersFile = "./passengers.csv";
        String transferStopsFile = "./TransferStops.csv";

        // Initializing the input stream variables
        BufferedReader bayshoreInputStream = null;
        BufferedReader vanNessInputStream = null;
        BufferedReader missionInputStream = null;
        BufferedReader kInglesideInputStream = null;
        BufferedReader lTaravalInputStream = null;
        BufferedReader nJudahInputStream = null;
        BufferedReader tThirdInputStream = null;
        BufferedReader passengersInputStream = null;
        BufferedReader transferStopsInputStream = null;

        try {
            // Grabbing the input streams
            bayshoreInputStream = new BufferedReader(new FileReader(new File(bayshoreFile)));
            vanNessInputStream = new BufferedReader(new FileReader(new File(vanNessFile)));
            missionInputStream = new BufferedReader(new FileReader(new File(missionFile)));
            kInglesideInputStream = new BufferedReader(new FileReader(new File(kInglesideFile)));
            lTaravalInputStream = new BufferedReader(new FileReader(new File(lTaravalFile)));
            nJudahInputStream = new BufferedReader(new FileReader(new File(nJudahFile)));
            tThirdInputStream = new BufferedReader(new FileReader(new File(tThird)));
            passengersInputStream = new BufferedReader(new FileReader(new File(passengersFile)));
            transferStopsInputStream = new BufferedReader(new FileReader(new File(transferStopsFile)));

//            Route bayshore = new Route(bayshoreStops, bayshoreStartID, bayshoreStopID);
//            LRV lrv1 = new LRV(bayshore, bayshorePassengers, bayshoreDriver, /* direction */ );

            // Skipping the first lines of each file
            bayshoreInputStream.readLine();     // bus
            vanNessInputStream.readLine();      // bus
            missionInputStream.readLine();      // bus
            kInglesideInputStream.readLine();   // LRV
            lTaravalInputStream.readLine();     // LRV
            nJudahInputStream.readLine();        // LRV
            tThirdInputStream.readLine();       // LRV
            passengersInputStream.readLine();   // Passengers
            transferStopsInputStream.readLine();// Transfer stops

            // Creating a variable for each line in each file
            String bayshoreLine;
            String vanNessLine;
            String missionLine;
            String kInglesideLine;
            String lTaravalLine;
            String nJudahLine;
            String tThirdLine;
            String passengersLine;
            String transferStopsLine;

            // Create raw arrayLists and end arrays to be used in parse into nested arrays
            ArrayList<String[]> rawBayshore = new ArrayList<String[]>();
            ArrayList<String[]> rawVanNess = new ArrayList<String[]>();
            ArrayList<String[]>  rawMission = new ArrayList<String[]>();
            ArrayList<String[]> rawKIngleside = new ArrayList<String[]>();
            ArrayList<String[]> rawLTaraval = new ArrayList<String[]>();
            ArrayList<String[]> rawNJudah = new ArrayList<String[]>();
            ArrayList<String[]> rawTThird = new ArrayList<String[]>();
            ArrayList<String[]> rawPassengers = new ArrayList<String[]>();
            ArrayList<String[]> rawTransferStops = new ArrayList<String[]>();

            // Looping through each file
            // 8x Bayshore
            while ((bayshoreLine = bayshoreInputStream.readLine()) != null) {
                rawBayshore.add(bayshoreLine.split(","));
            }
            String[] bayshoreStopNames = new String[rawBayshore.size()];
            String[] bayshoreStopIDs = new String[bayshoreStopNames.length];
            sortOutArrays(rawBayshore, bayshoreStopNames, bayshoreStopIDs);
            while ((vanNessLine = vanNessInputStream.readLine()) != null) {
               rawVanNess.add(vanNessLine.split(","));
            }
            String[] vanNessStopNames = new String[rawVanNess.size()];
            String[] vanNessStopIDs = new String[vanNessStopNames.length];
            sortOutArrays(rawVanNess, vanNessStopNames, vanNessStopIDs);
            while ((missionLine = missionInputStream.readLine()) != null) {
               rawMission.add(missionLine.split(","));
            }
            String[] missionStopNames = new String[rawMission.size()];
            String[] missionStopIDs = new String[missionStopNames.length];
            sortOutArrays(rawMission, missionStopNames, missionStopIDs);
            while ((kInglesideLine = kInglesideInputStream.readLine()) != null) {
                rawKIngleside.add(kInglesideLine.split(","));
            }
            String[] kInglesideStopNames = new String[rawKIngleside.size()];
            String[] kInglesideStopIDs = new String[kInglesideStopNames.length];
            sortOutArrays(rawKIngleside, kInglesideStopNames, kInglesideStopIDs);
            while ((lTaravalLine = lTaravalInputStream.readLine()) != null) {
                rawLTaraval.add(lTaravalLine.split(","));
            }
            String[] lTaravalStopNames = new String[rawLTaraval.size()];
            String[] lTaravalStopIDs = new String[lTaravalStopNames.length];
            sortOutArrays(rawLTaraval, lTaravalStopNames, lTaravalStopIDs);
            while ((nJudahLine = nJudahInputStream.readLine()) != null) {
                rawNJudah.add(nJudahLine.split(","));
            }
            String[] nJudahStopNames = new String[rawNJudah.size()];
            String[] nJudahStopIDs = new String[nJudahStopNames.length];
            sortOutArrays(rawNJudah, nJudahStopNames, nJudahStopIDs);
            while ((tThirdLine = tThirdInputStream.readLine()) != null) {
                rawTThird.add(tThirdLine.split(","));
            }
            String[] tThirdStopNames = new String[rawTThird.size()];
            String[] tThirdStopIDs = new String[tThirdStopNames.length];
            sortOutArrays(rawTThird, tThirdStopNames, tThirdStopIDs);
            while ((passengersLine = passengersInputStream.readLine()) != null) {
                rawPassengers.add(passengersLine.split(","));
            }
            String[] passengersNames = new String[rawPassengers.size()];
            String[] passengersStartIDs = new String[passengersNames.length];
            String[] passengersEndIDs = new String[passengersStartIDs.length];
            sortOutArrays(rawPassengers, passengersNames, passengersStartIDs, passengersEndIDs);
            while ((transferStopsLine = transferStopsInputStream.readLine()) != null) {
                rawTransferStops.add(transferStopsLine.split(","));
            }
            String[] transferStopBusIDs = new String[rawTransferStops.size()];
            String[] transferStopLRVIDs = new String[transferStopBusIDs.length];
            String[] transferStopNames = new String[transferStopLRVIDs.length];
            String[] transferStopRoutesToBeTransfered = new String[transferStopNames.length];
            sortOutArrays(rawTransferStops, transferStopBusIDs, transferStopLRVIDs, transferStopNames, transferStopRoutesToBeTransfered);
            for(int i = 0; i < transferStopBusIDs.length; i++){
                System.out.println(transferStopBusIDs[i]);
                System.out.println(transferStopLRVIDs[i]);
                System.out.println(transferStopNames[i]);
                System.out.println(transferStopRoutesToBeTransfered[i]);
                System.out.println();
            }
            // Final recap of all Arrays in Existence right now is as follows
            // stopNames[] for all routes
            // stopIDs[] for all routes
            // passengerNames[]
            // passengerStartIDs[]
            // passengerEndIDs[]
            // transferStopBusIDs[] stopID of the actual bus stop
            // transferStopLRVIDs[] stopID of the actual LRV stop
            // transferStopNames[] i think this one is pretty self-explanitory
            // transferStopRoutesToBeTransfered[] contains the routes that transfer at that transfer stop

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bayshoreInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public static void sortOutArrays(ArrayList<String[]> rawText, String[] one, String[] two){
        int j = 0;
        int k = 0;
        for(int q = 0; q < rawText.size(); q++ ){
            for(int i = 0; i < rawText.get(q).length; i++){
                if(i == 0){
                    one[j] = rawText.get(q)[i];
                    j++;
                } else if(i == 1){
                    two[k] = rawText.get(q)[i];
                    k++;
                }
            }
        }
    }
    public static void sortOutArrays(ArrayList<String[]> rawText, String[] one, String[] two, String[] three){
        int j = 0;
        int k = 0;
        int l = 0;
        for(int q = 0; q < rawText.size(); q++ ){
            for(int i = 0; i < rawText.get(q).length; i++){
                if(i == 0){
                    one[j] = rawText.get(q)[i];
                    j++;
                } else if(i == 1){
                    two[k] = rawText.get(q)[i];
                    k++;
                } else if( i == 2){
                    three[l] = rawText.get(q)[i];
                    l++;
                }
            }
        }
    }
    public static void sortOutArrays(ArrayList<String[]> rawText, String[] one, String[] two, String[] three, String[] four){
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        for(int q = 0; q < rawText.size(); q++ ){
            for(int i = 0; i < rawText.get(q).length; i++){
                if(i == 0){
                    one[j] = rawText.get(q)[i];
                    j++;
                } else if(i == 1){
                    two[k] = rawText.get(q)[i];
                    k++;
                } else if( i == 2){
                    three[l] = rawText.get(q)[i];
                    l++;
                } else if(i == 3){
                    four[m]= rawText.get(q)[i];
                    m++;
                }
            }
        }
    }
}
