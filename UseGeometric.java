package Geometric;

public class UseGeometric {
    public static void main(String[] args)
    {
        Square square = new Square(10,10, "Square");
        System.out.println(square.toString());
        
        Triangle triangle = new Triangle(10,10, "Triangle");
        System.out.println(triangle.toString());
        
        Square square1 = new Square(15,15, "Square");
        System.out.println(square1.toString());
        
        Triangle triangle1 = new Triangle(5,5, "Triangle");
        System.out.println(triangle1.toString());
        
        Square square2 = new Square(7,7, "Square");
        System.out.println(square2.toString());
        
        Triangle triangle2 = new Triangle(7,7, "Triangle");
        System.out.println(triangle2.toString());
    }
}

