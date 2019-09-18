/**
 * 
 */
package com.taskmanager.dao;

import java.util.List;

import com.taskmanager.model.ParentTask;
import com.taskmanager.model.Task;

/**
 * @author SumeetK
 *
 */
public interface TaskDao {
	
	public void addOrUpdateTask(Task task);
	
	public int addOrUpdateParent(ParentTask parentTask);
	
	public List<Task> viewTask();

}
