package com.tuanlm.medicine.repository;

import com.tuanlm.medicine.entity.BlogUserEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface BlogUserRepository extends CrudRepository<BlogUserEntity, Integer>, JpaSpecificationExecutor<BlogUserEntity> {

}
