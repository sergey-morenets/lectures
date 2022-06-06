package capgemini.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("dbWriter")
@Primary
@Qualifier("db")
public class DbWriter implements Writer {

    @Value("${db.server}")
    private String server;

    @Value("${db.name}")
    private String dbName;

//    private static final DbWriter INSTANCE = new DbWriter();
//
//    public static DbWriter getInstance() {
//        return INSTANCE;
//    }

    @Override
    public void write(String text) {
        System.out.println("DB:" + text);
    }

    @PostConstruct
    protected void init() {
        System.out.println("Server is " + server + " and db name is " + dbName);
    }
}
