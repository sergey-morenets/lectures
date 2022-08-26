package capgemini.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter {

    public static void main(String[] args) {
//        ConsoleLogger consoleLogger = new ConsoleLogger();
//        Server server = new Server(consoleLogger);
//        //Another component
//        ConsoleLogger consoleLogger2 = new ConsoleLogger();

        try (AnnotationConfigApplicationContext applicationContext = new
                AnnotationConfigApplicationContext(CustomConfiguration.class)) {

            FileLogger fileLogger = applicationContext.getBean(FileLogger.class);
            Server server = applicationContext.getBean(Server.class);
            server.start();
            server.stop();

        }

        //Server server = new Server(new ConsoleLogger());

    }

}
