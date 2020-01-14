package files;

import java.io.*;
import java.util.Date;

/**
 * @author Gayan Samuditha
 */

public class InputSteamToFile {
    public static void main(String[] args) {

        File file = null;
        FileInputStream fileInputStream = null;

        try {
            file = new File("D:/My Developments/FileOperations/InputStreamFile.txt");
            fileInputStream = new FileInputStream(file);

            System.out.println("bytes in file: "+fileInputStream.available());

            int line;

            while ((line=fileInputStream.read()) != -1) {
                System.out.print((char)line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }
}
