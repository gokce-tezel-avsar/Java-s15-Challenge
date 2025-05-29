package com.library.person;

import java.time.LocalDate;
import java.util.Map;

public class Author extends Person{//yazarları tutan sınıf
    private Map<Integer,String > books;//yazarın yazdığı kitapların olduğu dizi id ve isim ile tutuluyor;


    public Author(String id, String firstName, String lastName, String email, String password, Map<Integer, String> books) {
        super(id, firstName, lastName, email, password);
        this.books = books;
    }

    @Override
    public String whoYouAre() {
        return "Author";
    }

    public boolean newBook(int id, String bookTitle) {
        if (!books.containsKey(id)) {
            books.put(id, bookTitle);
            return true;
        } else {
            System.out.println("Bu ID ile zaten bir kitap mevcut.");
            return false;
        }
    }
}
