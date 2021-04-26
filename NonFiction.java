package Book;

public class NonFiction extends Book {

    public NonFiction(String Title) 
    {
        super(Title);
        setPrice();
    }

    public void setPrice() 
    {
        price=37.99;
    }

    public String toString() 
    {
        System.out.println("Book Category: Non-Fiction");
        return "Title: "+getTitle()+"\nPrice: $"+getPrice()+"\n";
    }

}
