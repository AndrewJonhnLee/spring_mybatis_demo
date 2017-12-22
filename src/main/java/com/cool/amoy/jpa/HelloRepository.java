package com.cool.amoy.jpa;

import com.cool.amoy.model.Entity.HelloModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface HelloRepository extends PagingAndSortingRepository<HelloModel, Long> {

    Page<HelloModel> findAll(Pageable pageable);
    HelloModel findById(int id);
}
