package day02.library;

import java.time.LocalDateTime;

public class RentalRecord {
    int memberId;
    String bookTitle;
    LocalDateTime borrowTime;

    public RentalRecord(int memberId, String bookTitle) {
        this.memberId = memberId;
        this.bookTitle = bookTitle;
        this.borrowTime = LocalDateTime.now();
    }
}
