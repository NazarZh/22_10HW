package com.company;

import com.company.hw.Book;
import com.company.hw.Customer;
import com.company.hw.Post;

public class Main {

    public static void main(String[] args) {
        System.out.printf("Book - %s, pages - %d\n",Book.NAME, Book.PAGES);
        System.out.printf("Post number - %d, location - %s\n",Post.NUMBER,Post.LOCATION);
        System.out.printf("Customer's name - %s, customer's age - %d\n", Customer.NAME,Customer.AGE);
        Book book = new Book(0);
        System.out.printf("I am now on %sth page\n", book.getPageWhereIAm());




        book.setPageWhereIAm(20);
        System.out.printf("I am now on %sth page\n", book.getPageWhereIAm());


        System.out.printf("I booked the book %s using %dth post in %s, so now I am on %d page.",Book.NAME,Post.NUMBER,Post.LOCATION,book.getPageWhereIAm());


    }
}
