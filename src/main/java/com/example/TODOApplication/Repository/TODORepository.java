package com.example.TODOApplication.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class TODORepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void save(Todo todo) {
        entityManager.persist(todo);
    }

}
