/**
 * 
 */
package com.taskmanager.model;

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
@Table(name = "parent_task")
public class ParentTask {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int parent_id;
	@Column(name = "parent_task")
	private String parentTask;
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
	 * @param parent_id
	 * @param parentTask
	 */
	public ParentTask(int parent_id, String parentTask) {
		super();
		this.parent_id = parent_id;
		this.parentTask = parentTask;
	}
	/**
	 * 
	 */
	public ParentTask() {
		super();
	}
	
	

}
