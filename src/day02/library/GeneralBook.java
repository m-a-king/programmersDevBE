package day02.library;

import java.util.Scanner;

public class GeneralBook extends Book implements Borrowable {
    private boolean isRented = false;

    public GeneralBook(String author, String title) {
        super(author, title);
    }

    @Override
    void printInfo() {
        System.out.println(">>> GENERAL <<<");
        super.printInfo();
        System.out.println("Can Rent?: " + (isRented ? "X" : "O"));
        System.out.println("---------------");
    }

    @Override
    public void borrow(int memberId, String title) {
        if (!isRented) {
            isRented = true;
            System.out.println(
                    "저자: " + author +
                            "제목: " + title + " 을 빌립니다 ->: " + memberId);
        } else {
            System.out.println(
                    "저자: " + author +
                            "제목: " + title + " 을 빌릴 수 없습니다.");
        }
    }

    public boolean isRented() {
        return isRented;
    }
}
