/**
 * 
 */
package com.taskmanager.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	/** Initialize the LOGGER object */
	private static final Log logger = LogFactory.getLog(TaskService.class);

	@Autowired
	private TaskDaoImpl taskDaoImpl;

	@PostMapping(value = "/addtask", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Task addTask(@RequestBody Task task) {
		logger.info("Method Started in Service - addTask()");
		/*
		 * Task task1 = new Task(); task1.setTaskName("New Task"); task1.setPriority(1);
		 * // task1.setParent_task(""); task1.setStartDate(new Date());
		 * task1.setEndDate(new Date());
		 */

		return taskDaoImpl.addTask(task);
	}

	@PutMapping(value = "/updatetask", produces = MediaType.APPLICATION_JSON_VALUE)
	public Task updateTask() {
		logger.info("Method Started in Service - updateTask()");
		Task task1 = new Task();
		task1.setTaskName("New Task");
		task1.setPriority(1);
		task1.setParentTask("Sumeet");
		task1.setStartDate(new Date());
		task1.setEndDate(new Date());

		logger.info("Method Ended in Service - updateTask()");
		return taskDaoImpl.updateTask(task1);
	}

	@GetMapping(value = "/tasks", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Task> getTasks() {
		logger.info("Method Started in Service - getTasks()");
		List<Task> taskList = new ArrayList<Task>();
		taskList = taskDaoImpl.getTasks();
		logger.info("Method Ended in Service - getTasks()");
		return taskList;
	}

	@PutMapping(value = "/updateendstatus", produces = MediaType.APPLICATION_JSON_VALUE)
	public Task updateEndStatus(@RequestBody Task task) {
		logger.info("Method Started in Service - updateEndStatus()");

		logger.info("Method Ended in Service - updateEndStatus()");
		return taskDaoImpl.updateEndTask(task);
	}

}
