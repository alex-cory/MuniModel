import java.io.*;

public class ReadFile {
    String path;
    RandomAccessFile myFile;
    BufferedReader textReader;
    PrintWriter textFile;
    /**
     * Constructor decides which data type to assign input to
     * @param newFile file name
     * @param type uses a keyword to decide which variable to use
     */
    public ReadFile(String newFile, String type){
        path = newFile;
        try{
            if(type.equalsIgnoreCase("CSV"))
                textReader = new BufferedReader(new FileReader(path));
            if(type.equalsIgnoreCase("New File"))
                textFile = new PrintWriter(newFile, "UTF-8");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * Opens the two .csv files
     * Puts their data into a double array which
     * is then sorted into usable info with sortOutArrays()
     * @param numElements the number of Elements in the .csv file
     * @param start acts as an index
     * @param raw array to hold retrieved values
     * @return a double array of unsorted values
     */
    public String[][] openCSV(int numElements, int start,  String[][] raw){
        String line;
        if(start < numElements){
            try{
                line = textReader.readLine();
                String[] a = line.split(",");
                raw[start] = a;
            }catch(IOException e){
                System.out.println("OH NOES! I BROKE AT OPENABBREVPOP");
            }finally {
                start++;
                openCSV(numElements, start, raw);
            }
        }
        return raw;
    }

    /**
     * Due to use of the split() function in openCSV(),
     * we must sort the triple array into three other arrays
     * in order to use their info
     * @param rawText The unsorted double array
     * @param one an array to hold one half of the values
     * @param two an array to hold the other half of the values
     */
    public void sortOutArrays(String[][] rawText, String[] one, String[] two, String[] three){
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

    /**
     * Converts a String[] to an int[]
     * @param one
     * @return
//     */
//    public int[] stringToInt(String[] one){
//        int[] two = int[one.length];
//        for(int i = 0; i < one.length; i++){
//            two[i] = Integer.parseInt(one[i]);
//        }
//        return two;
//    }
    /**
     * Generates the .csv file showing listing three things from arrays using recursion
     * @param one First array
     * @param two Second array
     * @param three Third array
     * @param start Acts as an index
     * @param end The final value for use in recursion
     */
    public void generateCSV(String[] one, String[] two, String[] three, int start, int end){
        if(start < end){
            textFile.write("\n" + one[start] + "," + two[start] + "," + three[start]);
            start++;
            generateCSV(one,two,three,start,end);
        }
        textFile.close();
    }
}
