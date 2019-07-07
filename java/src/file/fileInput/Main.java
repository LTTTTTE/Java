package file.fileInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args) {


        String localFilePath = "src\\file\\test.txt";

        try (Stream<String> stream = Files.lines(Paths.get(localFilePath))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }


        String filePath = "http://202.30.32.202:1234//phpUpload//uploads//렐름커맨드.txt";

        try {
            new BufferedReader(
                    new InputStreamReader(
                            new URL(filePath).openStream()
                    ))
                    .lines()
                    .forEach(System.out::println);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
