package com.byaj.pathways.repositories;

import com.byaj.pathways.models.Job;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.Set;

public interface JobRepository extends CrudRepository<Job, Integer> {
    Optional<Job> findByOnetsoccode(String onetsoccode);
}
