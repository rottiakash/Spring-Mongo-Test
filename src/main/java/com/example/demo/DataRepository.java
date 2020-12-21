package com.example.demo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface DataRepository extends MongoRepository<Data,String>
{
   Data findByUsn(String usn);

   @Query("{age:{$gt:18}}")
   List<Data> major();

}