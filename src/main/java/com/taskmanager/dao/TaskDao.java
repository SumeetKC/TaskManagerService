/**
 * 
 */
package com.taskmanager.dao;

import java.util.List;

import com.taskmanager.model.Task;

/**
 * @author SumeetK
 *
 */

public interface TaskDao {
	
	public Task addTask(Task task);
	
	public Task updateTask(Task task);
	
	public List<Task> getTasks();
	
	public Task updateEndTask(Task task);

}
