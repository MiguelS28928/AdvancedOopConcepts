package Book;

public class UseBook {

    public static void main(String[] args) {
        Fiction f=new Fiction("1984");
        System.out.println(f.toString());
        NonFiction nf=new NonFiction("Hiroshima");
        System.out.println(nf.toString());
    }

}
