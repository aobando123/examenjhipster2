package io.github.jhipster.application.service.impl;

import io.github.jhipster.application.service.SprintService;
import io.github.jhipster.application.domain.Sprint;
import io.github.jhipster.application.repository.SprintRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing Sprint.
 */
@Service
public class SprintServiceImpl implements SprintService {

    private final Logger log = LoggerFactory.getLogger(SprintServiceImpl.class);

    private final SprintRepository sprintRepository;

    public SprintServiceImpl(SprintRepository sprintRepository) {
        this.sprintRepository = sprintRepository;
    }

    /**
     * Save a sprint.
     *
     * @param sprint the entity to save
     * @return the persisted entity
     */
    @Override
    public Sprint save(Sprint sprint) {
        log.debug("Request to save Sprint : {}", sprint);
        return sprintRepository.save(sprint);
    }

    /**
     * Get all the sprints.
     *
     * @return the list of entities
     */
    @Override
    public List<Sprint> findAll() {
        log.debug("Request to get all Sprints");
        return sprintRepository.findAll();
    }


    /**
     * Get one sprint by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    public Optional<Sprint> findOne(String id) {
        log.debug("Request to get Sprint : {}", id);
        return sprintRepository.findById(id);
    }

    /**
     * Delete the sprint by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(String id) {
        log.debug("Request to delete Sprint : {}", id);
        sprintRepository.deleteById(id);
    }
}
