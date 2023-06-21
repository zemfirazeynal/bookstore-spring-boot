package az.bookstorespringboot.bookstorespringboot.service;

import az.bookstorespringboot.bookstorespringboot.model.Book;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface BookService  {

    Book create(Book book);


    void delete(Long id);


    Set<Book> books();


    Book update(Long id, Book book);

}
