package capgemini.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("console")
public class ConsoleWriter implements Writer {
    @Override
    public void write(String text) {
        System.out.println("Console:" + text);
    }
}
