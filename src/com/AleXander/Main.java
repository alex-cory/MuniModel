package com.AleXander;

import java.io.*;
import java.util.Scanner;
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
        String nJudahFile = "./NJudah.dat"; // LRV
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
//            nJudahInputStream = new BufferedReader(new FileReader(new File(nJudahFile)));
//            tThirdInputStream = new BufferedReader(new FileReader(new File(tThird)));
//            passengersInputStream = new BufferedReader(new FileReader(new File(passengersFile)));
//            transferStopsInputStream = new BufferedReader(new FileReader(new File(transferStopsFile)));

//            Route bayshore = new Route(bayshoreStops, bayshoreStartID, bayshoreStopID);
//            LRV lrv1 = new LRV(bayshore, bayshorePassengers, bayshoreDriver, /* direction */ );

            // Skipping the first lines of each file
            bayshoreInputStream.readLine();     // bus
            vanNessInputStream.readLine();      // bus
            missionInputStream.readLine();      // bus
            kInglesideInputStream.readLine();   // LRV
            lTaravalInputStream.readLine();     // LRV
//            nJudahInputStream.readLine();        // LRV
//            tThirdInputStream.readLine();       // LRV
//            passengersInputStream.readLine();   // Passengers
//            transferStopsInputStream.readLine();// Transfer stops

            // Creating a variable for each line in each file
            String bayshoreLine;
            String vanNessLine;
            String missionLine;
            String kInglesideLine;
            String lTaravalLine;
            String nJudaLine;
            String tThirdLine;
            String passengersLine;
            String transferStopsLine;

            // Looping through each file
            while ((bayshoreLine = bayshoreInputStream.readLine()) != null) {
//                System.out.println(bayshoreLine);
            }
            while ((vanNessLine = vanNessInputStream.readLine()) != null) {
//               System.out.println(vanNessLine);
            }
           while ((missionLine = missionInputStream.readLine()) != null) {
//               System.out.println(missionLine);
           }
            while ((kInglesideLine = kInglesideInputStream.readLine()) != null) {
//                System.out.println(kInglesideLine);
            }
            while ((lTaravalLine = lTaravalInputStream.readLine()) != null) {
//                System.out.println(lTaravalLine);
            }
//            while ((nJudaLine = nJudahInputStream.readLine()) != null) {
////                System.out.println(nJudaLine);
//            }
//            while ((tThirdLine = tThirdInputStream.readLine()) != null) {
////                System.out.println(tThirdLine);
//            }
//            while ((passengersLine = passengersInputStream.readLine()) != null) {
////                System.out.println(passengersLine);
//            }
//            while ((transferStopsLine = transferStopsInputStream.readLine()) != null) {
////                System.out.println(transferStopsLine);
//            }

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
}
