package honework8;

public class Main {
    public static void main(String[] args) {
        class GraphicEditor {
            private Shape shape;

            public GraphicEditor(Shape shape) {
                this.shape = shape;
            }

            public void printShapeName() {
                System.out.println(shape.getName());
            }
        }
    }
}
