package capgemini.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringStarter {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CapgeminiConfiguration.class)) {

            Writer writer = context.getBean("dbWriter", Writer.class);

            ProductAPI productAPI = context.getBean(ProductAPI.class);

            System.out.println(context.getBean(String.class));


//        Writer writer = new DbWriter();
//        ProductAPI productAPI = new ProductAPI();
//        productAPI.setWriter(writer);
            Product product = productAPI.findProduct(1);

            OrderAPI orderAPI = new OrderAPI();
        }
    }
}
