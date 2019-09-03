/**
 * 
 */
package com.taskmanager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanager.dao.TaskDao;
import com.taskmanager.model.ParentTask;
import com.taskmanager.model.Task;

/**
 * @author SumeetK
 *
 */
@RestController
@RequestMapping("/api")
public class TaskService {
	
	@Autowired
	private TaskDao taskDao;
	
	@PutMapping("/add")
	public @ResponseBody void addOrUpdateTask(@RequestBody Task task, @RequestBody ParentTask parentTask){
		
	}
	
	@GetMapping("/view")
	public @ResponseBody List<Task> viewTask(){
		ArrayList<Task> taskList = new ArrayList<Task>();
		return taskList;
	}

}
