package com.library.person;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

        public static List<Books> getSampleBooks() {
            List<Books> kitaplar = new ArrayList<>();
            kitaplar.add(new Books(1, "Kırmızı Pazartesi"));
            kitaplar.add(new Books(2, "Körlük"));
            kitaplar.add(new Books(3, "Kırmızı Saçlı Kadın"));
            return kitaplar;
        }

}

