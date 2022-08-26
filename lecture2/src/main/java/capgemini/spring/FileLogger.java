package capgemini.spring;

//@Primary
//@Component
//@Qualifier("file")
public class FileLogger implements Logger {

    //@Value("${file.path}")
    private final String filePath;

    public FileLogger(String filePath) {
        this.filePath = filePath;
    }

    public void write(String message) {
        System.out.println("Write to file: " + filePath + ", message:" + message);

    }
}
