package com.crts.app.magna.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.crts.app.magna.main.model.StatusMaster;

@Repository
public interface HomeRepositoryI extends CrudRepository<StatusMaster, Integer>
{

	
}
