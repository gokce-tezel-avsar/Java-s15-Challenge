package com.library.person;

import java.util.Scanner;

public class Librarian extends Person {

    public Librarian(long id, String firstName, String lastName, String email, String password) {
        super(id, firstName, lastName, email, password);
    }

    @Override
    public String whoYouAre(Scanner scanner) {
        return "Librarian";
    }

}
