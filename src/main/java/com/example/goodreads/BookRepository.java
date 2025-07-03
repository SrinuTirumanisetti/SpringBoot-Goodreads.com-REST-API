package com.example.goodreads
import java.util.*;
import com.example.goodreads.Book;
import com.example.goodreads.BookService;
public interface BookRepository{
   ArrayList<Book> getBooks();
}