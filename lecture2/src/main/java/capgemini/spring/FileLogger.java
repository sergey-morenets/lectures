package capgemini.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
@Qualifier("file")
public class FileLogger implements Logger {

    private String filePath = "/opt/log.txt";

    public void write(String message) {
        System.out.println("Write to file: " + filePath + ", message:" + message);

    }
}
