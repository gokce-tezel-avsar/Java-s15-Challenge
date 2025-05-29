package com.library.person;

import java.time.LocalDate;
import java.util.Map;

public class Reader extends Person {
        private int borrowedBooksCount;

    public Reader(String id, String firstName, String lastName, String email, String password, int borrowedBooksCount) {
        super(id, firstName, lastName, email, password);
        this.borrowedBooksCount = borrowedBooksCount;
    }

    @Override
        public String whoYouAre() {
            return "Library User";
        }

        public boolean canBorrow() {
            if (borrowedBooksCount >= 0 && borrowedBooksCount <= 5) {
              return true;
            }else{
            return false;
        }
    }
        public int getRemainingBorrowLimit() {
            return 5 - borrowedBooksCount;
        }
        public int getBorrowedBooks(){
        return borrowedBooksCount;
        }

}
