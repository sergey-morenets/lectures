package capgemini.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dbWriter")
@Primary
@Qualifier("db")
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
