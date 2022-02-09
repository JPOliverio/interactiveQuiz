import java.io.FileNotFoundException;
import java.io.IOException;

public class AnswerReaderTest {
    public static void main(String[] args) throws IOException {
        AnswerLocator aLocation = new AnswerLocator("sample.q.txt");

        int aCount = aLocation.getAnswerCount();
        int aPosition = aLocation.getAnswerLocation(2);

        AnswerReader aReader = new AnswerReader("sample.q.txt", aPosition);

        System.out.println(aReader.getSolution());
       // System.out.println(aLocation.getAnswerCount());
        int numberOfChoices = aReader.getNumberofChoices();

        String[] choices = aReader.getChoices();
        Interface intf = new Interface();
        int solution = aReader.getSolution();
        QuestionLocator qLocator = new QuestionLocator("sample.q.txt");
        int qPosition = qLocator.getQuestionLocation(2);
        QuestionReader qReader = new QuestionReader("sample.q.txt", qPosition);
        String question = qReader.getQuestion();
        intf.updateInterface(question, choices, solution, numberOfChoices);

        long startTime = System.currentTimeMillis();
        long currentTime;
        long time;
        int qCount=1;
        boolean endgg=true;

        while(endgg){
            currentTime = System.currentTimeMillis();
            time = (currentTime-startTime)/1000;
            intf.statsUpdate(time);
            qCount = intf.getqCount();
            if(qCount>1){endgg = false;}
            System.out.println(qCount+" count");
        }
            currentTime = System.currentTimeMillis();
            time = (currentTime-startTime)/1000;
            intf.endGame(time);

        // System.out.println(qCount);









        
    }
}
