import java.lang.System;

public class TestBook {
    public static void main(String[] args) {

        Book b1 = new Book("White", 250);
        Book b2 = new Book("Black", 400);
        Book b3 = new Book("Red");

        b3.setPages(40);

        System.out.println(b1);

        b1.numberOfCharacters();
        b2.numberOfCharacters();
        b3.numberOfCharacters();
    }

}
