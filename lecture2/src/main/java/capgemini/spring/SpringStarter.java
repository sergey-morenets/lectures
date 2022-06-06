package capgemini.spring;

public class SpringStarter {

    public static void main(String[] args) {
        Writer writer = new DbWriter();
        ProductAPI productAPI = new ProductAPI();
        productAPI.setWriter(writer);
        Product product = productAPI.findProduct(1);
    }
}
