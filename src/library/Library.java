package library;

public class Library {
    private Book book;
    private String name;
    private Card card;

    public Library(Book book, String name, Card card) {
        this.book = book;
        this.name = name;
        this.card = card;
        System.out.println("i am library constructor");
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
