package file.tryWIthResource;

import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        FileExecution execution1 = new TryFinally(); //Di
        FileExecution execution2 = new TryWIthResource(); //Di

        Stream execute1 = execution1.execute("java/src/file/test.txt");
        Stream execute2 = execution2.execute("java/src/file/test.txt");

        System.out.println(execute1.collect(Collectors.joining()));
        System.out.println(execute2.collect(Collectors.joining()));
    }
}
