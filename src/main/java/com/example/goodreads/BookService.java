package com.example.goodreads

import java.util.*;
import com.example.goodreads.Book;
import com.example.goodreads.BookRepository;

public class BookService implements BookRepository{
        private HashMap<Integer,Book> hmap = new HashMap<>();
        public BookService(){
            Book b1 = new Book(1,"harry Potter","harry_potter.jpg");
            Book b2 = new Book(2,"Rise","rise.jpeg");
            hmap.add(b1.getId(),b1);
            hmap.add(b2.getId(),b2);
        }
        @override
        ArrayList<Book> getBooks(){
            Collection<Book> bookCollection = hmap.values();
            ArrayList<Book> books = new ArrayList<>(booksCollections);
            return books; 
        }
}