package capgemini.spring;

import org.springframework.beans.factory.annotation.Value;

//@Primary
//@Component
//@Qualifier("file")
public class FileLogger implements Logger {

    @Value("${file.path}")
    private String filePath;

    public void write(String message) {
        System.out.println("Write to file: " + filePath + ", message:" + message);

    }
}
