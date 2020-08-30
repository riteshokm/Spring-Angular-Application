package com.rkm.project.demo;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public interface UserRepo extends CrudRepository<Donor,Long> {

    void deleteById(Integer id);

    Optional<Donor> findById(Integer id);

    }
