/**
 * 
 */
package com.taskmanager.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author SumeetK
 *
 */
@Entity
@Table
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int task_id;
	private int parent_id;
	private String parent_task;
	@Column(name = "task")
	private String taskName;
	@Column(name = "start_date")
	private Date startDate;
	@Column(name = "end_date")
	private Date endDate;
	private int priority;
	private String endTaskStatus;

	
	/**
	 * @return the task_id
	 */
	public int getTask_id() {
		return task_id;
	}


	/**
	 * @param task_id the task_id to set
	 */
	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}


	/**
	 * @return the parent_id
	 */
	public int getParent_id() {
		return parent_id;
	}


	/**
	 * @param parent_id the parent_id to set
	 */
	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}


	/**
	 * @return the taskName
	 */
	public String getTaskName() {
		return taskName;
	}


	/**
	 * @param taskName the taskName to set
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}


	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}


	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}


	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	/**
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}


	/**
	 * @param priority the priority to set
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}


	/**
	 * @return the endTaskStatus
	 */
	public String getEndTaskStatus() {
		return endTaskStatus;
	}


	/**
	 * @param endTaskStatus the endTaskStatus to set
	 */
	public void setEndTaskStatus(String endTaskStatus) {
		this.endTaskStatus = endTaskStatus;
	}

	/**
	 * @return the parent_task
	 */
	public String getParent_task() {
		return parent_task;
	}

	/**
	 * @param parent_task the parent_task to set
	 */
	public void setParent_task(String parent_task) {
		this.parent_task = parent_task;
	}


	/**
	 * @param task_id
	 * @param parent_id
	 * @param parent_task
	 * @param taskName
	 * @param startDate
	 * @param endDate
	 * @param priority
	 * @param endTaskStatus
	 */
	public Task(int task_id, int parent_id, String parent_task, String taskName, Date startDate, Date endDate,
			int priority, String endTaskStatus) {
		super();
		this.task_id = task_id;
		this.parent_id = parent_id;
		this.parent_task = parent_task;
		this.taskName = taskName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.priority = priority;
		this.endTaskStatus = endTaskStatus;
	}


	/**
	 * 
	 */
	public Task() {
		super();
	}

}
