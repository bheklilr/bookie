package edu.bheklilr.bookie;

import edu.bheklilr.bookie.models.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    	return application.sources(Application.class);
    }

    @Bean
    public CommandLineRunner loadData(UserRepo userRepo, BookRepo bookRepo, AuthorRepo authorRepo) {
        return (String... args) -> {
            Author[] authors = new Author[] {
                new Author("J. R. R. Tolkien"),
                new Author("Andy Weir"),
                new Author("Terry Pratchett"),
            };

            for (Author author : authors) {
                authorRepo.save(author);
            }

            Book[] books = new Book[] {
                new Book("The Fellowship of the Ring", authors[0], 1954),
                new Book("The Two Towers", authors[0], 1954),
                new Book("The Return of the King", authors[0], 1955),
                new Book("The Martian", authors[1], 2011),
                new Book("The Colour of Magic", authors[2], 1983),
                new Book("The Light Fantastic", authors[2], 1986),
            };

            for (Book book : books) {
                bookRepo.save(book);
            }

            User[] users = new User[] {
                new User("bheklilr", "bheklilr's password", books[0], books[1], books[2]),
                new User("foobar", "foobar's password", books[3]),
                new User("bazqux", "baxqux's password", books[0], books[4], books[5]),
            };
            for (User user : users) {
                MessageDigest md = MessageDigest.getInstance("SHA-256");
                md.update(user.getPasswordHash().getBytes(StandardCharsets.UTF_8));
                byte[] digest = md.digest();
                user.setPasswordHash(String.format("%064x", new BigInteger(1, digest)));

                userRepo.save(user);
            }
        };
    }
}
