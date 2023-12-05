package hw4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminar4.mockTest.EmailSender;
import seminar4.mockTest.EmailService;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BookServiceTest {

    @Test
    void findBookById() {

        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        Book book1 = new Book("1");
        Book book2 = new Book("2");
        Book book3 = new Book("3");


        bookService.findBookById(book1.getId());
        verify(bookRepository).findById(book1.getId());

    }

    @Test
    void findAllBooks() {
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        bookService.findAllBooks();
        verify(bookRepository, times(1)).findAll();
    }
}