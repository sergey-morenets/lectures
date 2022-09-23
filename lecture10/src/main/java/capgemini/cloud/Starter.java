package capgemini.cloud;

public class Starter {

    public static void main(String[] args) throws InterruptedException {
        Object obj = "";
        if (obj instanceof String text) {
            System.out.println(text.length());
        } else if (obj instanceof Integer i) {
            System.out.println(i.byteValue());
        }

        switch (obj) {
            case String text -> System.out.println(text.length());
            case Integer i -> System.out.println(i.byteValue());
            default -> {
            }
        }

        if (obj instanceof Location(int x,int y) location) {
            System.out.println(x);
        }

//        Thread thread = new Thread(() -> System.out.println("Hello, Capgemini!"));
//        thread.start();

        Thread.startVirtualThread(() -> System.out.println("Hello, Capgemini!"));

        Thread.sleep(100);
    }

    record Location(int x, int y) {
    }
}
