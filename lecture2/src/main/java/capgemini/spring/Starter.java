package capgemini.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter {

    public static void main(String[] args) {
//        ConsoleLogger consoleLogger = new ConsoleLogger();
//        Server server = new Server(consoleLogger);
//        //Another component
//        ConsoleLogger consoleLogger2 = new ConsoleLogger();

        try (AnnotationConfigApplicationContext applicationContext = new
                AnnotationConfigApplicationContext("capgemini.spring")) {

            FileLogger fileLogger = applicationContext.getBean(FileLogger.class);

        }

    }

}
