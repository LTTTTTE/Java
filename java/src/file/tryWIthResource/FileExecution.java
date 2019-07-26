package file.tryWIthResource;

import java.io.IOException;
import java.util.stream.Stream;

public interface FileExecution {
    Stream execute(String filePath) throws IOException;
}
