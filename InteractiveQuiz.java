

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.LinkedList;

public class InteractiveQuiz {

    public static void main(String[] args) throws FileNotFoundException {

        LinkedList<Integer> queLocations = new LinkedList<Integer>();
        LinkedList<Integer> ansLocations = new LinkedList<Integer>();
        try {
            // open file in read mode
            RandomAccessFile file = new RandomAccessFile("sample.q.txt", "r");
            // read until end of file
            String line;
            int i = 0;
            while ((line = file.readLine()) != null) {
                if(line.startsWith("@A")){
                    ansLocations.add(i);
                }

                System.out.println(line);
                System.out.println("location: "+file.getFilePointer());
                i++;
                
            }



        
            // close the file
            file.close();
                
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try{

        RandomAccessFile files = new RandomAccessFile("sample.q.txt", "r");
        files.seek(14);
        System.out.println(files.readLine());
        } catch (Exception e){
            System.out.println("fail");
        }



        System.out.println(ansLocations.size()+" test");


    }

}