/**
 * 
 */
package com.taskmanager.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanager.dao.TaskDaoImpl;
import com.taskmanager.model.Task;

/**
 * @author SumeetK
 *
 */

@CrossOrigin(origins = "http://locahost:4200")
@RestController
@RequestMapping("/api")
public class TaskService {
	
	@Autowired
	private TaskDaoImpl taskDaoImpl;
	
	@RequestMapping("/addtask")
	public int addTask() {
		System.out.println("Inside Method");
		Task task1 = new Task();
		task1.setTaskName("New Task");
		task1.setPriority(1);
		task1.setParent_task("Parent");
		task1.setStartDate(new Date());
		task1.setEndDate(new Date());
		
        return taskDaoImpl.addTask(task1);
    }
	
	
	/*
	 * @PutMapping("/updateTask") public ResponseEntity<Task>
	 * updateTask(@PathVariable(value = "id") Long employeeId,
	 * 
	 * @Valid @RequestBody Task task) { Employee employee =
	 * employeeRepository.findById(employeeId) .orElseThrow(() -> new
	 * ResourceNotFoundException("Employee not found for this id :: " +
	 * employeeId));
	 * 
	 * employee.setEmailId(employeeDetails.getEmailId());
	 * employee.setLastName(employeeDetails.getLastName());
	 * employee.setFirstName(employeeDetails.getFirstName()); final Employee
	 * updatedEmployee = employeeRepository.save(employee); return
	 * ResponseEntity.ok(updatedEmployee); }
	 */
	
	@GetMapping("/tasks")
	public @ResponseBody List<Task> viewTask(){
		List<Task> taskList = new ArrayList<Task>();
		taskList = taskDaoImpl.viewTask();
		return taskList;
	}

}
