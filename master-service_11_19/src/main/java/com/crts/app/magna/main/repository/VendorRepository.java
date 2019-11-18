package com.crts.app.magna.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.magna.main.model.VendorDetails;
@Repository
public interface VendorRepository extends CrudRepository<VendorDetails, Integer> {

}
