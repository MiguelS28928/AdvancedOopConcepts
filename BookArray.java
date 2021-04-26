package Book;

public class BookArray {

    public static void main(String[] args) {
        
        Book Array[]={
        		new Fiction("1984"),
                new Fiction("The Great Gatsby"),
                new Fiction("Lord of the Rings"),
                new Fiction("Alice's Adventures in Wonderland"),
                new Fiction("The Hobbit,or There and Back Again"),
                new NonFiction("Hiroshima"),
                new NonFiction("Alexander Hamilton"),
                new NonFiction("Out of Africa"),
                new NonFiction("I Know Why the Caged Bird Sings"),
                new NonFiction("In Cold Blood")};

        for(int i=0;i<Array.length;i++)
        {
            System.out.println(Array[i].toString());
        }
    }

}
