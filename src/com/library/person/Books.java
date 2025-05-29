package com.library.person;

import java.util.Date;

public class Books {//books abstract class aotım. books kategorileirni burdan türet
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
    public Books(long bookId,String title, Author author){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
    public Books(long bookId, String title){
        this.bookId = bookId;
        this.title = title;
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

    public double getPrice() {
        return price;
    }

    public int getEdition() {
        return edition;
    }

    public boolean isStatus() {
        return status;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookId=" + bookId +
                ", author=" + author +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", status=" + status +
                ", edition=" + edition +
                ", dateOfPurchase=" + dateOfPurchase +
                '}';
    }
}
