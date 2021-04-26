package Book;

public abstract class Book {
    
    private String Title;
    double price;
    
    public Book(String Title) 
    {
        super();
        this.Title = Title;
    }
    public String getTitle() 
    {
        return Title;
    }
    public double getPrice() 
    {
        return price;
    }
    public abstract void setPrice();
    

}
