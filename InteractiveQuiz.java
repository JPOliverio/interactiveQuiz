

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InteractiveQuiz {

    public static void main(String[] args) throws FileNotFoundException {


        BufferedReader reader = new BufferedReader(new FileReader("sample.q.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = reader.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = reader.readLine();
            }
            String everything = sb.toString();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try{
                reader.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }


    }

}