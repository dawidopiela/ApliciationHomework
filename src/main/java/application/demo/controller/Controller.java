package application.demo.controller;


import application.demo.model.Book;
import application.demo.servicebooks.Servicebooks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {
    //
    Servicebooks servicebooks;

    @Autowired
    public Controller(Servicebooks servicebooks) {
        this.servicebooks = servicebooks;
    }

    @GetMapping("/api/books")
    public Iterable<Book> list() {
        return servicebooks.list();
    }
}

