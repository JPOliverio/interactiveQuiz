
    
    import java.io.BufferedReader;
    import java.io.FileNotFoundException;
    import java.io.FileReader;
    import java.io.IOException;
    import java.io.RandomAccessFile;

    import java.nio.file.Files;
    import java.nio.file.Paths;
    import java.util.stream.*;
    
    public class testRead{
    
        public static void main(String[] args) throws FileNotFoundException {
            String line32;
            try (Stream<String> lines = Files.lines(Paths.get("sample.q.txt"))) {
                line32 = lines.skip(1).findFirst().get();
                System.out.println(line32);
            }
            catch(IOException e){
                System.out.print(e);
            }
    
        }
    
    }