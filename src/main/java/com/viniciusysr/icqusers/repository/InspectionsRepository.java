package com.viniciusysr.icqusers.repository;

import com.viniciusysr.icqusers.domain.Inspection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InspectionsRepository extends MongoRepository<Inspection, String> {

    @Query("{ 'title': { $regex: ?0, $options: 'i' } }")
    List<Inspection> searchPedido(String text);

    List<Inspection> findByTitleContainingIgnoreCase(String text);

}
