package io.github.jhipster.application.repository;

import io.github.jhipster.application.domain.Review;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


/**
 * Spring Data MongoDB repository for the Review entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ReviewRepository extends MongoRepository<Review, String> {

}
