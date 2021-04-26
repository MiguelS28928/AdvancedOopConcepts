package Book;

public class Fiction extends Book {

    public Fiction(String Title) 
    {
        super(Title);
        setPrice();
    }

    public void setPrice() 
    {
        price=24.99;
    }

    public String toString() 
    {
        System.out.println("Book Category: Fiction");
        return "Title: "+getTitle()+"\nPrice: $"+getPrice()+"\n";
    }
    

}
