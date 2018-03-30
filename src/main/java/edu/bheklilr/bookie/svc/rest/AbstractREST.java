package edu.bheklilr.bookie.svc.rest;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.UUID;

public abstract class AbstractREST<T> {
    private Class<T> t;

    public List<T> findAll() {
        EntityManager em = getEntityManager();
        try {
            CriteriaBuilder builder = em.getCriteriaBuilder();
            CriteriaQuery<T> cq = builder.createQuery(t);
            Root<T> root = cq.from(t);
            cq.select(root);
            return em.createQuery(cq).getResultList();
        } finally {
            em.close();
        }
    }

    public T findById(UUID id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(t, id);
        } finally {
            em.close();
        }
    }

    abstract EntityManager getEntityManager();
}
