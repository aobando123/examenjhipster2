package io.github.jhipster.application.repository;

import io.github.jhipster.application.domain.Team;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


/**
 * Spring Data MongoDB repository for the Team entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TeamRepository extends MongoRepository<Team, String> {

}
