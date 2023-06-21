package az.bookstorespringboot.bookstorespringboot.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Book {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Long bookId;
    private String bookName;
    private String author;
    private Long publishedDate;
}
