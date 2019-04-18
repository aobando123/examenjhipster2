package io.github.jhipster.application.repository;

import io.github.jhipster.application.domain.Sprint;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


/**
 * Spring Data MongoDB repository for the Sprint entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SprintRepository extends MongoRepository<Sprint, String> {

}
