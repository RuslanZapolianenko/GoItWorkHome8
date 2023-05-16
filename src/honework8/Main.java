package honework8;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Quad quad = new Quad();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Pentagon pentagon = new Pentagon();

        GraphicEditor editor = new GraphicEditor();
        editor.printShapeName(circle);     // Виведе "Circle"
        editor.printShapeName(quad);       // Виведе "Quad"
        editor.printShapeName(triangle);   // Виведе "Triangle"
        editor.printShapeName(rectangle);  // Виведе "Rectangle"
        editor.printShapeName(pentagon);   // Виведе "Pentagon"

    }
}
