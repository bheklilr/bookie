package edu.bheklilr.bookie.svc.rest;

import edu.bheklilr.bookie.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;
import java.util.UUID;


public class BooksREST extends AbstractREST<Book> {

    @Autowired
    private EntityManagerFactory emf;

    @Override
    EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    @Override
    @RequestMapping(method= RequestMethod.GET)
    public List<Book> findAll() {
        return super.findAll();
    }

    @Override
    @RequestMapping(method = RequestMethod.GET, path="{id}")
    public Book findById(@RequestParam UUID id) {
        return super.findById(id);
    }
}
