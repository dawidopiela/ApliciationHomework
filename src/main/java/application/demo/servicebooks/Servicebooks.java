package application.demo.servicebooks;

import application.demo.model.Book;
import application.demo.repository.RepositoryBooks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



    @Service
    public class Servicebooks {

        RepositoryBooks repositoryBooks;

        @Autowired
        public Servicebooks(RepositoryBooks repositoryBooks) {
            this.repositoryBooks = repositoryBooks;
        }
        public Iterable<Book> list() {
            return repositoryBooks.findAll();
        }

        //
        public Book save(Book book) {
            return repositoryBooks.save(book);
        }

        public void zapisz(List<Book> books) {
            repositoryBooks.saveAll(books);
        }
    }

