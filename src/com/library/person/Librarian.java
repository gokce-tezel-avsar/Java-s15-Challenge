package com.library.person;



public class Librarian extends Person {

    public Librarian(String id, String firstName, String lastName, String email, String password) {
        super(id, firstName, lastName, email, password);
    }

    @Override
    public String whoYouAre() {
        return "Librarian";
    }

}
