package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author Gayan Samuditha
 */

public class FileOutputStreamSolution{

    public static void main(String[] args) {
        File file = new File("D:/My Developments/FileOperations/FileOutputStream.txt");
        String data = "Hello Stream !";
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)){


            if (!file.exists()) {
                file.createNewFile();
            }

            byte[] bs = data.getBytes();

            fileOutputStream.write(bs);
            fileOutputStream.flush();
            fileOutputStream.close();

            System.out.println("File written successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
