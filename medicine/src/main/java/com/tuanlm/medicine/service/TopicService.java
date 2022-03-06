package com.tuanlm.medicine.service;

import com.tuanlm.medicine.customexception.DuplicatedEntityException;
import com.tuanlm.medicine.entity.TopicEntity;
import com.tuanlm.medicine.model.TopicModel;
import com.tuanlm.medicine.repository.TopicRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TopicService {
    private final TopicRepository topicRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(TopicService.class);

    public TopicService(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    public List<TopicEntity> getAll() {
        return (List<TopicEntity>) topicRepository.findAll();
    }

    /**
     *
     * @param model
     * @return created model
     */
    public TopicModel createTopic(TopicModel model) {
        //Check existed topic
        if(topicRepository.existsTopicEntityByName(model.getName())) {
            throw  new DuplicatedEntityException("Name of department have been existed");
        }

        //Create id
        model.setId(UUID.randomUUID());
        model.setStatus(true);

        //Prepare data for inserted and save
        TopicEntity entity = new TopicEntity(model);
        topicRepository.save(entity);

        //Write log
        LOGGER.info("Created a topic with id: " + model.getId());

        //Return created model
        return model;
    }
}
