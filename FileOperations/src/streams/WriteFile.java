package streams;


/**
 * @author Gayan Samuditha
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) {
        String data = "writing files to using BufferedWrite..";
        int numberOfLines = 1000;

        writeUsingFileWriter(data);
        writeUsingBufferedWriter(data, numberOfLines);


    }


    private static void writeUsingBufferedWriter(String data, int noOfLines) {
        File file = new File("D:/My Developments/FileOperations/BufferedWriter.txt");
        FileWriter fr = null;
        BufferedWriter br = null;

        String dataWithNewLine=data+System.getProperty("line.separator");

        try{
            fr = new FileWriter(file);
            br = new BufferedWriter(fr);
            for(int i = noOfLines; i>0; i--){
                br.write(dataWithNewLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void writeUsingFileWriter(String data) {

        File file = new File("D:/My Developments/FileOperations/FileWriter.txt");
        FileWriter fr = null;

        try {
            fr = new FileWriter(file);
            fr.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{

            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
