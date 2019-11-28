/**
 * 
 */
package com.taskmanager.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanager.dao.TaskDaoImpl;
import com.taskmanager.model.Task;

/**
 * @author SumeetK
 *
 */

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/v1")
public class TaskService {

	@Autowired
	private TaskDaoImpl taskDaoImpl;

	@PostMapping("/addtask")
	public int addTask(@Valid @RequestBody Task task) {
		System.out.println("Inside Method");
		/*
		 * Task task1 = new Task(); task1.setTaskName("New Task"); task1.setPriority(1);
		 * // task1.setParent_task(""); task1.setStartDate(new Date());
		 * task1.setEndDate(new Date());
		 */

		return taskDaoImpl.addTask(task);
	}

	@RequestMapping("/updatetask")
	public int updateTask() {
		System.out.println("Inside Update");
		Task task1 = new Task();
		task1.setTaskName("New Task");
		task1.setPriority(1);
		task1.setParent_task("Sumeet");
		task1.setStartDate(new Date());
		task1.setEndDate(new Date());

		return taskDaoImpl.updateTask(task1);
	}

	@GetMapping(value = "/tasks", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Task> getTasks() {
		List<Task> taskList = new ArrayList<Task>();
		taskList = taskDaoImpl.getTasks();
		return taskList;
	}

}
