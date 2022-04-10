package com.viniciusysr.icqusers.repository;

import com.viniciusysr.icqusers.domain.Inspection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InspectionsRepository extends MongoRepository<Inspection, String> {

}
