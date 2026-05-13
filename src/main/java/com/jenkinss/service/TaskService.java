package com.jenkinss.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jenkinss.entity.Status;
import com.jenkinss.entity.Task;
import com.jenkinss.repository.TaskRepository;

@Service
public class TaskService {

	private final TaskRepository repo;
	public TaskService(TaskRepository repo) {
		
		this.repo = repo;
	}
	
	public List<Task> findAll(){
		return repo.findAll();
	}
	
	public Task createTask(Task t) {
		t.setCreatedAt(LocalDateTime.now());
		t.setStatus(Status.PENDING);
		return repo.save(t);
	}
	
	
}
