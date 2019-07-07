package file.fileOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String localFilePath = "src\\file\\test.txt";

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(localFilePath,true));
        bufferedWriter.write("\n"+"newString");
        bufferedWriter.close();

    }
}
