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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author SumeetK
 *
 */
@Entity
@Table
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "task_id")
	private int taskId;
	@Column(name = "parent_id")
	private int parentId;
	@Column(name = "parent_task")
	private String parentTask;
	@Column(name = "task")
	private String taskName;
	@Column(name = "start_date")
	@Temporal(TemporalType.DATE)
	private Date startDate;
	@Column(name = "end_date")
	@Temporal(TemporalType.DATE)
	private Date endDate;
	private int priority;
	private boolean endTaskStatus;
	/**
	 * @return the taskId
	 */
	public int getTaskId() {
		return taskId;
	}
	/**
	 * @param taskId the taskId to set
	 */
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	/**
	 * @return the parentId
	 */
	public int getParentId() {
		return parentId;
	}
	/**
	 * @param parentId the parentId to set
	 */
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	/**
	 * @return the parentTask
	 */
	public String getParentTask() {
		return parentTask;
	}
	/**
	 * @param parentTask the parentTask to set
	 */
	public void setParentTask(String parentTask) {
		this.parentTask = parentTask;
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
	public boolean isEndTaskStatus() {
		return endTaskStatus;
	}
	/**
	 * @param endTaskStatus the endTaskStatus to set
	 */
	public void setEndTaskStatus(boolean endTaskStatus) {
		this.endTaskStatus = endTaskStatus;
	}
	/**
	 * @param taskId
	 * @param parentId
	 * @param parentTask
	 * @param taskName
	 * @param startDate
	 * @param endDate
	 * @param priority
	 * @param endTaskStatus
	 */
	public Task(int taskId, int parentId, String parentTask, String taskName, Date startDate, Date endDate,
			int priority, boolean endTaskStatus) {
		super();
		this.taskId = taskId;
		this.parentId = parentId;
		this.parentTask = parentTask;
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
