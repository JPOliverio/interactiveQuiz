

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

public class InteractiveQuiz {

    public static void main(String[] args) throws FileNotFoundException {


        BufferedReader reader = new BufferedReader(new FileReader("sample.q.txt"));
        try {
            // open file in read mode
            RandomAccessFile file = new RandomAccessFile("sample.q.txt", "r");
            // read until end of file
            String line;
            while ((line = file.readLine()) != null) {
                System.out.println(line);
            }
        
            // close the file
            file.close();
                
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}