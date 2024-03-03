package Assignment5;

public class MainShape {
    public static void main(String[] args) {
        Shape[] type = new Shape[5];
        type[0] = new Rectangle("black",2,3);
        type[1] = new Circle("white",2);
        type[2] = new Square("pink",2,2);
        type[3] = new Square("grey",3,3);
        type[4] = new Circle("pink",3.02);
        printTotal(type);
    }
    public static void printTotal(Shape[] shape){
        for(Shape i: shape){
            System.out.println("The area: " + i.calculateArea());
            System.out.println("The perimeter: " + i.calculatePerimeter());
        }
    }
}
