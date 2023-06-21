package az.bookstorespringboot.bookstorespringboot.controller;

import az.bookstorespringboot.bookstorespringboot.model.Book;
import az.bookstorespringboot.bookstorespringboot.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("book")
@RequiredArgsConstructor
@Slf4j
public class BookController {

    private final BookService bookService;

    @PostMapping
    public Book create (@RequestBody Book book){
        log.info("call create!");
        return bookService.create(book);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        log.info("call delete!");
        bookService.delete(id);
    }

    @GetMapping
    public Set<Book> books(){
        log.info("call get!");
        return bookService.books();
    }

    @PutMapping("/{id}")
    public Book book(@RequestBody Book book, @PathVariable Long id){
        log.info("call update!");
        return bookService.update(id, book);

    }




}
