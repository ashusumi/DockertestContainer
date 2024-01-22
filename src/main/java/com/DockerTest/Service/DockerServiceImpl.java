package com.DockerTest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DockerTest.Dao.DockerTestRepo;
import com.DockerTest.Model.DockerTest;

@Service
public class DockerServiceImpl {

	
	@Autowired
	public DockerTestRepo repo;
	
	public List<DockerTest>  getContainers() {
		try {
			return repo.findAll();
		} catch (Exception e) {
			throw e;
		}
	}
}
