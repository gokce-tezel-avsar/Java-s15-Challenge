package com.library.person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReaderMetods {
    private List<Books> books;

    public ReaderMetods(List<Books> books) {
        this.books = books;
    }

    public List<String> showBooksByAuthor(String authorName) {
        List<String> result = new ArrayList<>();
        for (Books b : books) {
            if (b.getAuthor().equals(authorName)) {
                result.add(b.getTitle()); // daha okunabilir çıktı için title
            }
        }
        return result;
    }

    public List<Long> showBooksById(int id) {
        List<Long> result = new ArrayList<>();
        for (Books b : books) {
            if (b.getBookId() == id) {
                result.add(b.getBookId());
            }
        }
        return result;
    }

    public Map<String, Long> showBooks(String authorName, int id) {
        Map<String, Long> result = new HashMap<>();
        for (Books b : books) {
            if (b.getAuthor().equals(authorName) || b.getBookId() == id) {
                result.put(b.getTitle(), b.getBookId());
            }
        }
        return result;
    }
}
