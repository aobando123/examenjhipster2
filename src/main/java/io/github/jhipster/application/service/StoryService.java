package io.github.jhipster.application.service;

import io.github.jhipster.application.domain.Story;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing Story.
 */
public interface StoryService {

    /**
     * Save a story.
     *
     * @param story the entity to save
     * @return the persisted entity
     */
    Story save(Story story);

    /**
     * Get all the stories.
     *
     * @return the list of entities
     */
    List<Story> findAll();


    /**
     * Get the "id" story.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<Story> findOne(String id);

    /**
     * Delete the "id" story.
     *
     * @param id the id of the entity
     */
    void delete(String id);
}
