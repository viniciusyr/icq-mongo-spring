package com.viniciusysr.icqusers.repository;

import com.viniciusysr.icqusers.domain.Inspectors;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InspectorRepository extends MongoRepository<Inspectors, String> {

}
