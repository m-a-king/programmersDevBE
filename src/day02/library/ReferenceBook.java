package day02.library;

public class ReferenceBook extends Book {
    public ReferenceBook(String author, String title) {
        super(author, title);
    }

    @Override
    void printInfo() {
        System.out.println(">> REFERENCE <<");
        super.printInfo();
        System.out.println("Status: Not for Rent");
        System.out.println("---------------");
    }
}
