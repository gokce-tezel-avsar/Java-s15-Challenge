package com.library.person;

import java.util.Scanner;

public class Reader extends Person {
    private int borrowedBooksCount;

    public Reader(long id, String firstName, String lastName, String email, String password, int borrowedBooksCount) {
        super(id, firstName, lastName, email, password);
        this.borrowedBooksCount = borrowedBooksCount;
    }

    @Override
        public String whoYouAre(Scanner scanner) {
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
