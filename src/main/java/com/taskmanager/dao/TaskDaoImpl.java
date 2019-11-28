package com.taskmanager.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.taskmanager.model.ParentTask;
import com.taskmanager.model.Task;

@Repository
public class TaskDaoImpl implements TaskDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public int addTask(Task task) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		int parentId;
		int taskId;
		String parentName;
		try {
			tx = session.beginTransaction();
			ParentTask parentTask = new ParentTask();
			parentName = task.getParent_task();
			if (parentName != null) {
				// Setting parent task from task object
				parentTask.setParentTask(parentName);
				// Saving parent task into table
				parentId = (int) session.save(parentTask);

				// Setting parent id in task object
				task.setParent_id(parentId);

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

		return taskId;

	}

	@Override
	public int updateTask(Task task) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		int parentId;
		int taskId;
		try {
			tx = session.beginTransaction();
			ParentTask parentTask = new ParentTask();
			String parentName = task.getParent_task();
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

		return taskId;

	}

	@Override
	public List<Task> getTasks() {
		// TODO Auto-generated method stub
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

		return taskList;
	}

}
