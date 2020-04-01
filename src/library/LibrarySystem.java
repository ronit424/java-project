package library;

import java.util.Date;

public class LibrarySystem {
    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthorName("Ronit shahh");
        book.setBookName("Page of life");
        book.setBookNumber(4567);
        book.setBookPrice(112.5);
        book.setBorrowDate(new Date());
        book.setPublishedDate(new Date());
        book.setRemainingQuantity(36);
        book.setQuantity(55);
        book.setReturnDate(new Date());
        Card card = new Card();
        card.setCardId(2228);
        card.setExpirationDate(new Date());
        Library library = new Library(book,"english library",card);
        System.out.println(library.getBook().getBookName());
    }
}
