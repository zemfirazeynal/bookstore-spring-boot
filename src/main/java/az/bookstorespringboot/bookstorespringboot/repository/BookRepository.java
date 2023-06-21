package az.bookstorespringboot.bookstorespringboot.repository;

import az.bookstorespringboot.bookstorespringboot.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Book, Long> {
}
