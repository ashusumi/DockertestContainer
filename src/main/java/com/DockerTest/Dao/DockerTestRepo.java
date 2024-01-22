package com.DockerTest.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.DockerTest.Model.DockerTest;

public interface DockerTestRepo extends MongoRepository<DockerTest, Integer> {

}
