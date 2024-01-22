package com.DockerTest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.DockerTest.Model.DockerTest;
import com.DockerTest.Service.DockerServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class DockerController {

	@Autowired
	private DockerServiceImpl impl;
	
	
	@GetMapping("/conatiner")
	public List<DockerTest> getContainers() {
		return impl.getContainers();
	}
	
}
