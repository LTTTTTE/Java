package file.tryWIthResource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class TryWIthResource implements FileExecution {
    @Override
    public Stream execute(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            return Stream.of(reader.readLine());
        }
    }
}
