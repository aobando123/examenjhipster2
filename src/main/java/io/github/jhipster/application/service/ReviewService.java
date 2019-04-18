package io.github.jhipster.application.service;

import io.github.jhipster.application.domain.Review;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing Review.
 */
public interface ReviewService {

    /**
     * Save a review.
     *
     * @param review the entity to save
     * @return the persisted entity
     */
    Review save(Review review);

    /**
     * Get all the reviews.
     *
     * @return the list of entities
     */
    List<Review> findAll();


    /**
     * Get the "id" review.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<Review> findOne(String id);

    /**
     * Delete the "id" review.
     *
     * @param id the id of the entity
     */
    void delete(String id);
}
