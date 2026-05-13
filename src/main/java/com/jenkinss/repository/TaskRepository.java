package com.jenkinss.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jenkinss.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Integer>{

}
