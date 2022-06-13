public sealed interface Shape permits Triangle, Rectangle {

    int getPerimeter();

    String getName();
}

final class Triangle implements Shape {

    @Override
    public int getPerimeter() {
        return 0;
    }

    @Override
    public String getName() {
        return "Triangle";
    }
}

non-sealed class Rectangle implements Shape {

    @Override
    public int getPerimeter() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}

class SubRectangle extends Rectangle {

}
