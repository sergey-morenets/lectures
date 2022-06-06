package capgemini.spring;

import org.springframework.stereotype.Component;

@Component
public class DbWriter implements Writer {

//    private static final DbWriter INSTANCE = new DbWriter();
//
//    public static DbWriter getInstance() {
//        return INSTANCE;
//    }

    @Override
    public void write(String text) {
        System.out.println("DB:" + text);
    }
}
