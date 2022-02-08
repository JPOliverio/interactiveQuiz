import java.io.FileNotFoundException;
import java.io.IOException;

public class AnswerReaderTest {
    public static void main(String[] args) throws IOException {
        AnswerLocator aLocation = new AnswerLocator("sample.q.txt");

        int aCount = aLocation.getAnswerCount();
        int aPosition = aLocation.getAnswerLocation(1);

        AnswerReader aReader = new AnswerReader("sample.q.txt", aPosition);

        System.out.println(aReader.getSolution());
       // System.out.println(aLocation.getAnswerCount());
        int numberOfChoices = aReader.getNumberofChoices();

        String[] choices = aReader.getChoices();
        Interface intf = new Interface();
        int solution = aReader.getSolution();
        QuestionReader qReader = new QuestionReader("sample.q.txt", 1);
        String question = qReader.getQuestion();
        intf.updateInterface(question, choices, solution, numberOfChoices);







        
    }
}
