package honework8;

public class Shape {
    public String getName() {
        return "Shape";
    }
}
class Circle extends Shape {
    @Override
    public String getName() {
        return "Circle";
    }
}
class Quad extends Shape {
    @Override
    public String getName() {
        return "Quad";
    }
}
class Triangle extends Shape {
    @Override
    public String getName() {
        return "Triangle";
    }
}
class Rectangle extends Shape {
    @Override
    public String getName() {
        return "Rectangle";
    }
}
class Pentagon extends Shape {
    @Override
    public String getName() {
        return "Pentagon";
    }
}
