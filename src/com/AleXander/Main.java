package com.AleXander;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {


        public static void main(String[] args) throws FileNotFoundException {
//        BufferedReader bayshoreInputStream = new BufferedReader(new FileReader("./8xBayshore.csv"));
            Scanner bayshoreInputStream = new Scanner(new File("47VanNess.csv"));
            // Scanner missionInputStream = new Scanner(new File("49Mission.csv"));
            // Scanner inglesideInputStream = new Scanner(new File("KIngleside.csv"));
            // Scanner taravalInputStream = new Scanner(new File("LTaraval.csv"));
            // Scanner judahInputStream = new Scanner(new File("NJudah.csv"));
            // Scanner tThirdInputStream = new Scanner(new File("TThird.csv"));

            bayshoreInputStream.nextLine(); // skips 1st line (bad - data)
            while (bayshoreInputStream.hasNext()) {
                String data = bayshoreInputStream.next();
                String values[] = data.split(",");
                System.out.println(values[0]);
            }

//
        }

}
