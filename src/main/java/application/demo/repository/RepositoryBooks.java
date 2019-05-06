package application.demo.repository;

import application.demo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryBooks extends CrudRepository<Book, Long> {


}
