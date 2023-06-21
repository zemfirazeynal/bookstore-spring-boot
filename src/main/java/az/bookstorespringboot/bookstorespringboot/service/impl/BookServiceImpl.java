package az.bookstorespringboot.bookstorespringboot.service.impl;

import az.bookstorespringboot.bookstorespringboot.model.Book;
import az.bookstorespringboot.bookstorespringboot.repository.BookRepository;
import az.bookstorespringboot.bookstorespringboot.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;


    @Override
    public Book create(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void delete(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book Not Found!"));
        bookRepository.delete(book);
    }

    @Override

    public Set<Book> books() {
        List<Book> all = bookRepository.findAll();
        return new HashSet<Book>(all);
    }

    @Override
    public Book update( Long id, Book newBook) {
        Book book = bookRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Book Not Found!"));
        book.setBookName(newBook.getBookName());
        book.setAuthor(newBook.getAuthor());
        book.setPublishedDate(newBook.getPublishedDate());
        return bookRepository.save(book);
    }

}
