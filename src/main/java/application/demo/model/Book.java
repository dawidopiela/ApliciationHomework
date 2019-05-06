package application.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@Entity
public class Book {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;
    private String isbn;
    private String title;
    private String subtitle;
    private  String publisher;
    private String publishedDate;
    private String description;
    private String pageCount;
    private String thumbnailUrl;
    private String language;
    private String previewLink;
    private String averageRating;
    private ArrayList<String> authors;
    private ArrayList<String> categories;



}
