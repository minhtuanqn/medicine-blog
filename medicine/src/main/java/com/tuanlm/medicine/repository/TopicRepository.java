package com.tuanlm.medicine.repository;

import com.tuanlm.medicine.entity.TopicEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<TopicEntity, Integer>, JpaSpecificationExecutor<TopicEntity> {
    boolean existsTopicEntityByName(String name);
}
