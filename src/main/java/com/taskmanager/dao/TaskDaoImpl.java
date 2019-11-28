package com.taskmanager.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.taskmanager.model.ParentTask;
import com.taskmanager.model.Task;

@Repository
public class TaskDaoImpl implements TaskDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public int addOrUpdateParent(ParentTask parentTask) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		session.saveOrUpdate(parentTask);
		session.close();
		return 0;
	}
	
	@Override
	public int addTask(Task task) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		ParentTask parentTask = new ParentTask();
		String parentName = task.getParent_task();
		//Setting parent task from task object
		parentTask.setParentTask(parentName);
		//Saving parent task into table
		int parentId = (int) session.save(parentTask);
		
		//Setting parent id in task object
		task.setParent_id(parentId);
		
		int task_id = (int) session.save(task);
		session.close();
		return task_id;
		
	}

	@Override
	public List<Task> viewTask() {
		// TODO Auto-generated method stub
		return null;
	}


}
