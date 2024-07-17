package day02.library;

public abstract class Book {
    String author, title;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    void printInfo() {
        System.out.println("author = " + author);
        System.out.println("title = " + title);
    }
}
