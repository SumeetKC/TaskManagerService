/**
 * 
 */
package com.taskmanager.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.taskmanager.model.ParentTask;
import com.taskmanager.model.Task;

/**
 * @author SumeetK
 *
 */
@Repository
public interface TaskDao {
	
	public int addTask(Task task);
	
	public int addOrUpdateParent(ParentTask parentTask);
	
	public List<Task> viewTask();

}
