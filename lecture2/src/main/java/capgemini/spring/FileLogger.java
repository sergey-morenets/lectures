package capgemini.spring;

import org.springframework.stereotype.Component;

@Component
public class FileLogger implements Logger {

    private String filePath = "/opt/log.txt";

    public void write(String message) {
        System.out.println("Write to file: " + filePath + ", message:" + message);

    }
}
