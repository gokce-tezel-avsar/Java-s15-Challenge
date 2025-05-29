import com.library.person.Author;

import java.util.Date;

public abstract class Books {//books abstract class aotım. books kategorileirni burdan türet
    private long bookId;
    private Author author;
    private String title;
    private double price;
    private boolean status; //ödünç alındı alınmadı
    private int edition;
    private Date dateOfPurchase;

    public Books(long bookId, Author author, String title, double price, boolean status, int edition, Date dateOfPurchase) {
        this.bookId = bookId;
        this.author = author;
        this.title = title;
        this.price = price;
        this.status = status;
        this.edition = edition;
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }
    public long getBookId(){
        return bookId;
    }

}
