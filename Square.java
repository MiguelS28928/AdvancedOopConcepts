package Geometric;

public class Square extends GeometricFigure {
    Square(double h, double w, String type)
    {
        super(h, w, type);
    }

    public double getA() 
    {
        return(super.getHeight()*super.getWidth());
    }

    public String toString() 
    {
        return "A " + super.getType() + " with the height of " + super.getHeight() + "m and width of " + super.getWidth() + "m has an area of " + this.getA() + "m";
    }
}


