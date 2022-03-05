package com.tuanlm.medicine.service;

import com.tuanlm.medicine.entity.TopicEntity;
import com.tuanlm.medicine.repository.TopicRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
