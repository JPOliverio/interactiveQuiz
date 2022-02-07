
import java.io.IOException;
import java.io.RandomAccessFile;

public class AnswerReader {

    String entireQuestion;
    String [] aChoices = new String[10];
    int solution;

public AnswerReader(String fileName, int aPosition){  //aPosition is the position of the desired answer start point in the text file
    String line=" ";
    int i = 0;
    boolean sFound = false; // has the soultion been identified.
    
    try{
        RandomAccessFile file = new RandomAccessFile(fileName, "r");
        file.seek(aPosition);
        while(line != null && !(line.startsWith("@E"))){ // stops if line is null or if we have gotten to the Answear section which mark the end of the questin.
            line = file.readLine();
            if(line != null){
                if((!(line.startsWith("*")) && !(line.trim().length()==0))){ //this line ignores * and blank spots in the text file
                    if(!(line.startsWith("@E"))){ // this looks for quesion end point
                        if(sFound==false){
                            solution = Integer.parseInt(line);
                            sFound =true;
                        }else{
                        aChoices[i]=line;
                        i++;
                        }
                    }  
                }   
            }     
        }
        file.close();
    } catch (IOException e){
        e.printStackTrace();
    }
}

public int getSolution(){
    return solution;
}

public String[] getChoices(){
    return aChoices;
}

public int getNumberofChoices(){
    return aChoices.length;
}

public String getChoice(int Choice){
    Choice = Choice - 1;
    return aChoices[Choice];
}
    
}
