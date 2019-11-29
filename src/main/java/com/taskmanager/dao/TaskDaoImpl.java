package com.taskmanager.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.taskmanager.model.ParentTask;
import com.taskmanager.model.Task;

@Repository
public class TaskDaoImpl implements TaskDao {

	/** Initialize the LOGGER object */
	private static final Log logger = LogFactory.getLog(TaskDaoImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Task addTask(Task task) {
		// TODO Auto-generated method stub
		logger.info("Method Started - addTask()");
		/*
		 * Task task1 = new Task(); task1.setTaskName("New Task"); task1.setPriority(1);
		 * task1.setParentTask("Parent5"); task1.setStartDate(new Date());
		 * task1.setEndDate(new Date());
		 */
		
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		int parentId;
		String parentName;
		try {
			tx = session.beginTransaction();
			ParentTask parentTask = new ParentTask();
			parentName = task.getParentTask();
			if (parentName != null) {
				// Setting parent task from task object
				parentTask.setParentTask(parentName);
				// Saving parent task into table
				parentId = (int) session.save(parentTask);

				// Setting parent id in task object
				task.setParentId(parentId);

			}
			session.save(task);
			tx.commit();

		} catch (Exception ex) {
			if (tx != null)
				tx.rollback();

			throw ex;
		} finally {
			session.close();
		}
		logger.info("Method Ended - addTask()");
		return task;

	}

	@Override
	public Task updateTask(Task task) {
		// TODO Auto-generated method stub
		logger.info("Method Started - updateTask()");
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		int parentId;
		int taskId;
		try {
			tx = session.beginTransaction();
			ParentTask parentTask = new ParentTask();
			String parentName = task.getParentTask();
			if (parentName != null) {
				// Setting parent task from task object
				parentTask.setParentTask(parentName);
				// Saving parent task into table
				session.saveOrUpdate(parentName, parentTask);
				//working here 

				// Setting parent id in task object
				//task.setParent_id(parentId);

			}

			taskId = (int) session.save(task);
			tx.commit();

		} catch (Exception ex) {
			if (tx != null)
				tx.rollback();

			throw ex;
		} finally {
			session.close();
		}
		logger.info("Method Ended - updateTask()");
		return task;

	}

	@Override
	public List<Task> getTasks() {
		// TODO Auto-generated method stub
		logger.info("Method Started - getTasks()");
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		List<Task> taskList = new ArrayList<Task>();
		try {
			tx = session.beginTransaction();
			taskList = session.createQuery("from Task", Task.class).list();
			tx.commit();

		} catch (Exception ex) {
			if (tx != null)
				tx.rollback();

			throw ex;
		} finally {
			session.close();
		}
		logger.info("Method Ended - getTasks()");
		return taskList;
	}

	@Override
	public Task updateEndTask(Task task) {
		// TODO Auto-generated method stub
		logger.info("Method Started - updateEndTask()");
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.saveOrUpdate("endTaskStatus", task);
			tx.commit();

		} catch (Exception ex) {
			if (tx != null)
				tx.rollback();

			throw ex;
		} finally {
			session.close();
		}
		logger.info("Method Ended - getTasks()");
		return null;
	}

}
