package com.taskmanager.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.taskmanager.model.ParentTask;
import com.taskmanager.model.Task;

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
	public void addOrUpdateTask(Task task) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		session.saveOrUpdate(task);
		
	}

	@Override
	public List<Task> viewTask() {
		// TODO Auto-generated method stub
		return null;
	}


}
