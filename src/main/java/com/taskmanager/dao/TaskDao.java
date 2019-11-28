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
	
	public int addTask(Task task);
	
	public int updateTask(Task task);
	
	public List<Task> getTasks();

}
