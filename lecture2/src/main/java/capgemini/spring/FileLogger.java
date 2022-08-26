package capgemini.spring;

//@Primary
//@Component
//@Qualifier("file")
public class FileLogger implements Logger {

    private String filePath = "/opt/log.txt";

    public void write(String message) {
        System.out.println("Write to file: " + filePath + ", message:" + message);

    }
}
