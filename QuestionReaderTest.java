import java.io.FileNotFoundException;

public class QuestionReaderTest {
   public static void main(String[] args) throws FileNotFoundException {
    QuestionLocator qlocator = new QuestionLocator("sample.q.txt");
    int qArray [] = qlocator.getAllQuestionLocations();
    int qPosition = qArray[2];
    System.out.println(qlocator.getQuestionCount());

       QuestionReader reader = new QuestionReader("sample.q.txt", qPosition);
       System.out.println(reader.getQuestion());
   } 
}
