package io.github.jhipster.application.service;

import io.github.jhipster.application.domain.Sprint;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing Sprint.
 */
public interface SprintService {

    /**
     * Save a sprint.
     *
     * @param sprint the entity to save
     * @return the persisted entity
     */
    Sprint save(Sprint sprint);

    /**
     * Get all the sprints.
     *
     * @return the list of entities
     */
    List<Sprint> findAll();


    /**
     * Get the "id" sprint.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<Sprint> findOne(String id);

    /**
     * Delete the "id" sprint.
     *
     * @param id the id of the entity
     */
    void delete(String id);
}
