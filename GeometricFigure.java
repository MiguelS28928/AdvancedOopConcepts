package Geometric;

public abstract class GeometricFigure {

	private String type;
	private double h;
    private double w;

    GeometricFigure(double h, double w, String type) 
    {
    	this.type = type;
    	this.h = h;
        this.w = w;
    }

    public double getHeight() 
    {
        return h;
    }
    
    public double getWidth() 
    {
        return w;
    }
    
    public String getType() 
    {
        return type;
    }

    public void setHeight(double h) 
    {
        this.h = h;
    }
    public void setWidth(double w) 
    {
        this.w = w;
    }

    public void setType(String type) 
    {
        this.type = type;
    }
        public abstract double getA();
}

