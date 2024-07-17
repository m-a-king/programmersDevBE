package day02.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 도서 대여 시스템 앱 - CLI
public class LibraryApp {
    Scanner scanner = new Scanner(System.in);
    List<Book> books = new ArrayList<>();
    List<RentalRecord> rentalRecords = new ArrayList<>();


    public int selectMenu() {
        showMenu();
        System.out.print("메뉴 번호를 선택하세요: ");
        int menu = Integer.parseInt(scanner.nextLine());
        printLine();
        return menu;
    }

    private void showMenu() {
        printLine();
        System.out.println(">>>>> 메뉴 <<<<<");
        System.out.println("1. 일반 도서 등록");
        System.out.println("2. 참고 도서 등록");
        System.out.println("3. 모든 도서 출력");
        System.out.println("4. 도서 대여");
        System.out.println("5. 대여된 모든 도서 목록");
        System.out.println("0. 종료");
        printLine();
    }


    private void printLine() {
        System.out.println("====================");
    }

    public static void main(String[] args) {
        LibraryApp app = new LibraryApp();
        while (true) {
            int menu = app.selectMenu();

            switch (menu) {
                case 1 -> app.registerGeneralBook();
                case 2 -> app.registerReferenceBook();
                case 3 -> app.printAllBook();
                case 4 -> app.rentalBook();
                case 5 -> app.printRentalRecord();
                case 0 -> {
                    System.out.println("프로그램을 종료합니다");
                    return;
                }
                default -> System.out.println("잘못된 번호를 입력했습니다");
            }

        }

    }

    private void printRentalRecord() {
        if (rentalRecords.isEmpty()) {
            System.out.println("현재 대여 중인 도서가 없습니다.");
        } else {
            System.out.println("대여 중인 도서 목록:");
            for (RentalRecord record : rentalRecords) {
                System.out.println("멤버 아이디: " + record.memberId + ", 제목: " + record.bookTitle + ", 대여 날짜: " + record.borrowTime);
            }
        }
    }

    private void rentalBook() {
        System.out.print("멤버 ID를 입력하세요: ");
        int memberId = Integer.parseInt(scanner.nextLine());
        System.out.print("대여할 도서 제목을 입력하세요: ");
        String title = scanner.nextLine().trim();

        // 도서 검색 및 대여 처리
        Book bookToRent = findBookByTitle(title);

        if (bookToRent instanceof Borrowable && !((GeneralBook) bookToRent).isRented()) {
            ((GeneralBook)bookToRent).borrow(memberId, title);
            rentalRecords.add(new RentalRecord(memberId, title));  // Add to rental records

            System.out.println(title + " 도서가 성공적으로 대여되었습니다.");
        } else {
            System.out.println("대여할 수 없거나 존재하지 않는 도서입니다.");
        }
    }

    private Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.title.equals(title)) {
                return book;
            }
        }
        return null;  // 책을 찾지 못한 경우
    }

    private void printAllBook() {
        for (Book book : books) {
            book.printInfo();
        }
    }

    private void registerGeneralBook() {
        System.out.print("일반 도서 제목 입력 : ");
        String title = scanner.nextLine();

        System.out.print("일반 도서 저자 입력 : ");
        String author = scanner.nextLine();

        Book newBook = new GeneralBook(author, title);
        books.add(newBook);

        System.out.println("일반 도서 목록에 추가되었어요 : " + newBook.author + "님의 " + newBook.title);

    }

    private void registerReferenceBook() {
        System.out.print("참고 도서 제목 입력 : ");
        String title = scanner.nextLine();

        System.out.print("참고 도서 저자 입력 : ");
        String author = scanner.nextLine();

        Book newBook = new ReferenceBook(author, title);
        books.add(newBook);

        System.out.println("참고 도서 목록에 추가되었어요 : " + newBook.author + "님의 " + newBook.title);
    }
}
