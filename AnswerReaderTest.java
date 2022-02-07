import java.io.FileNotFoundException;

public class AnswerReaderTest {
    public static void main(String[] args) throws FileNotFoundException {
        AnswerLocator aLocation = new AnswerLocator("sample.q.txt");

        int aCount = aLocation.getAnswerCount();
        int aPosition = aLocation.getAnswerLocation(2);

        AnswerReader aReader = new AnswerReader("sample.q.txt", aPosition);

        System.out.println(aReader.getSolution());
       // System.out.println(aLocation.getAnswerCount());
       




        
    }
}
