package com.crts.app.magna.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.crts.app.magna.main.model.EnquiryDetails;

@Repository
public interface EnquiryDetailsRepository extends CrudRepository<EnquiryDetails, Integer>{

}