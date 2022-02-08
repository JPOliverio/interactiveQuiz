import java.io.File;
import java.io.FileNotFoundException;

public class QuestionLocationsTest {

    public static void main(String[] args) throws FileNotFoundException {
        QuestionLocator qlocator = new QuestionLocator("sample.q.txt");
        System.out.println(qlocator.getQuestionCount());
    }
    
}
