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
	
	public void addOrUpdateTask(Task task);
	
	public List<Task> viewTask();

}
