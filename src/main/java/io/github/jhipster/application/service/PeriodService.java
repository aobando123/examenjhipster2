package io.github.jhipster.application.service;

import io.github.jhipster.application.domain.Period;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing Period.
 */
public interface PeriodService {

    /**
     * Save a period.
     *
     * @param period the entity to save
     * @return the persisted entity
     */
    Period save(Period period);

    /**
     * Get all the periods.
     *
     * @return the list of entities
     */
    List<Period> findAll();


    /**
     * Get the "id" period.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<Period> findOne(String id);

    /**
     * Delete the "id" period.
     *
     * @param id the id of the entity
     */
    void delete(String id);
}
