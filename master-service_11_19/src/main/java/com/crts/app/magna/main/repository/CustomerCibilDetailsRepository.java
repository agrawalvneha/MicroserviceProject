package com.crts.app.magna.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.crts.app.magna.main.model.CustomerCibilDetails;

@Repository
public interface CustomerCibilDetailsRepository extends CrudRepository<CustomerCibilDetails, Integer>{

}