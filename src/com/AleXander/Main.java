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
            //Don't read out the first line of the passengers b/c has no header
//            passengersInputStream.readLine();   // Passengers
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

            // Create raw arrays and use below to parse into nested arrays
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
            while ((bayshoreLine = bayshoreInputStream.readLine()) != null) {
                rawBayshore.add(bayshoreLine.split(","));
            }
            while ((vanNessLine = vanNessInputStream.readLine()) != null) {
               rawVanNess.add(vanNessLine.split(","));
            }
            while ((missionLine = missionInputStream.readLine()) != null) {
               rawMission.add(missionLine.split(","));
            }
            while ((kInglesideLine = kInglesideInputStream.readLine()) != null) {
                rawKIngleside.add(kInglesideLine.split(","));
            }
            while ((lTaravalLine = lTaravalInputStream.readLine()) != null) {
                rawLTaraval.add(lTaravalLine.split(","));
            }
            while ((nJudahLine = nJudahInputStream.readLine()) != null) {
                rawNJudah.add(nJudahLine.split(","));
            }
            while ((tThirdLine = tThirdInputStream.readLine()) != null) {
                rawTThird.add(tThirdLine.split(","));
            }
            while ((passengersLine = passengersInputStream.readLine()) != null) {
                rawPassengers.add(passengersLine.split(","));
            }
            while ((transferStopsLine = transferStopsInputStream.readLine()) != null) {
                rawTransferStops.add(transferStopsLine.split(","));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bayshoreInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // inputStream2.nextLine(); // skips the first line (bad data)
//            while (bayshoreInputStream.hasNext()) {
//                String data = bayshoreInputStream.next(); // gets the next string value
//                String values[] = data.split(",");
////                String data2 = inputStream2.next(); // gets the line
////                String nameValues[] = data2.split(",");
////                Float data3 = inputStream3[count];
//
//                // storing the Abbreviations and Populations into the state object for each
////                State state = new State(values[0], nameValues[0], Integer.parseInt(values[1]), data3);
//
//                // adding each state object to an array
////                states.add(state);
//
////                System.out.println(state.getAbbreviation() + ", " + state.getName() + ", " + state.getPopulation() + ", " + state.getTotalPopulationPercent());
////                count++;
//                bayshoreInputStream.close();
////                inputStream2.close();
////                SetStateAttributes(count);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//        Scanner bayshoreInputStream;
//        try {
//
//
//            bayshoreInputStream.next(); // skips 1st line (bad - data)
//
//            while (bayshoreInputStream.hasNext()) {
//                String data = bayshoreInputStream.next();
//                String values[] = data.split(",");
//                System.out.println(values);
//            }
//        } catch (IOException e){
//            System.out.println(e.getMessage());
//        }
////
//    }

    }
    public static void sortOutArrays(String[][] rawText, String[] one, String[] two, String[] three){
        int j = 0;
        int k = 0;
        int l = 0;
        for(int q = 0; q < rawText.length; q++ ){
            for(int i = 0; i < rawText[q].length; i++){
                if(i == 0){
                    one[j] = rawText[q][i];
                    j++;
                } else if(i == 1){
                    two[k] = rawText[q][i];
                    k++;
                }
                if(rawText[q].length == 3) {
                    if (i == 3) {
                        three[l] = rawText[q][i];
                        l++;
                    }
                }
            }
        }
    }
}
