package capgemini.spring;

public class ConsoleWriter implements Writer {
    @Override
    public void write(String text) {
        System.out.println("Console:" + text);
    }
}
