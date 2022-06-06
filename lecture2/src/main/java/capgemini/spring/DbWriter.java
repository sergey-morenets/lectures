package capgemini.spring;

public class DbWriter implements Writer {
    @Override
    public void write(String text) {
        System.out.println("DB:" + text);
    }
}
