package com.AleXander;

public class DeleteMe {

	public static void main(String[] args) {
		// Vehicle Files
		String[][] vehicleFiles = new String[][]{
                 {"bus", "bus", "bus", "lrv", "lrv", "lrv", "lrv"}, // vehicle keys
                 {"8xBayshore.csv", "47VanNess.csv", "49Mission.csv", "KIngleside.csv", "LTaraval.csv", "NJudah.csv", "TThird.csv"} // vehicle values
         };

//         System.out.println(vehicleFiles.length); // value = 2
//         System.out.println(vehicleFiles[0].length); // value = 7

        // for each Row in Rows
		int rowLength = vehicleFiles.length;
		for (int i = 0; i < rowLength; i++) {
            int columnLength = vehicleFiles[i].length;
            String[] columns = vehicleFiles[i];
             // for each Column in Columns
            for (int j = 0; j < columnLength; j++ )
                if (columns[j] == "bus") {
                    System.out.println("Bus: " + columns[j]); // should output: BUS: Bus
                } else if (columns[j] == "lrv") {
                    System.out.println("LRV: " + columns[j]); // should output: LRV: Lrv
                }
            }
        }

//    public static void main(String[] args){
//        String[][] names = {
//            {"Mr. ","Mrs. ","Ms. "},
//            {"Smith","Jones"}};
//
//        // Mr. Smith
//        System.out.println(names[0][0] +
//                           names[1][0]);
//        // Ms. Jones
//        System.out.println(names[0][2] +
//                           names[1][1]);
//    }
}