package com.jenkinss.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jenkinss.entity.Task;
import com.jenkinss.service.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
	
	
	private final TaskService service;
	
	public TaskController(TaskService service) {
		this.service = service;
	}
	
	@GetMapping
	public ResponseEntity<List<Task>> findAll(){
		return ResponseEntity.ok(service.findAll());
	}
	
	@PostMapping
	public ResponseEntity<Task> createJob(@RequestBody Task t){
		return ResponseEntity.ok(service.createTask(t));
	}
	

}
