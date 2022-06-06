package capgemini.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringStarter {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("capgemini");

        ProductAPI productAPI = context.getBean(ProductAPI.class);

//        Writer writer = new DbWriter();
//        ProductAPI productAPI = new ProductAPI();
//        productAPI.setWriter(writer);
        Product product = productAPI.findProduct(1);

        OrderAPI orderAPI = new OrderAPI();
    }
}
