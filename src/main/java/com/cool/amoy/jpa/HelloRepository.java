package com.cool.amoy.jpa;

import com.cool.amoy.model.Entity.HelloModel;
import org.springframework.data.repository.CrudRepository;

public interface HelloRepository extends CrudRepository<HelloModel, Long>{

    @Override
    HelloModel findOne(Long aLong);
}
