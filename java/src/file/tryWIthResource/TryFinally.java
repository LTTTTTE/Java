package file.tryWIthResource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class TryFinally implements FileExecution {

    @Override
    public Stream execute(String filePath) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        try {
            return Stream.of(reader.readLine());
        }finally {
            reader.close();
        }

    }
}
