package application.demo;

import application.demo.model.Book;
import application.demo.servicebooks.Servicebooks;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.tomcat.jni.File;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Logger;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Bean
    CommandLineRunner runner(Servicebooks servicebooks) {
        return args -> {
            // read JSON and load json
            ObjectMapper mapper = new ObjectMapper();
            TypeReference<List<Book>> typeReference = new TypeReference<List<Book>>() {
            };
            InputStream inputStream = TypeReference.class.getResourceAsStream("/resources/books.json");
            try {
            List<Book> books = mapper.readValue(inputStream,typeReference);
            servicebooks.save((Book) books);
            System.out.println("Books Saved!");
        } catch (IOException e){
            System.out.println("Unable to save books: " + e.getMessage());
        }

        };
    }
}
