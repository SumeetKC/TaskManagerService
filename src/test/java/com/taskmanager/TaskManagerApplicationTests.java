package com.taskmanager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.taskmanager.dao.TaskDao;
import com.taskmanager.model.Task;
import com.taskmanager.service.TaskService;

@SpringBootTest
public class TaskManagerApplicationTests {

	@InjectMocks
	TaskService taskService;
     
    @Mock
    TaskDao taskDao;
     
    @Test
    public void testAddTask() 
    {
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
         
        Task task = new Task(1, 1, "parent", "taskname", new Date(), new Date(), 2, false);
        when(taskDao.addTask(task)).thenReturn(task);
         
        
        try {
        	Task task1 = taskDao.addTask(task);
        	assertEquals(task, task1);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("The exception is : " + e);
			e.printStackTrace();
		}
        
    }
    
    @Test
    public void testUpdateTask() 
    {
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
         
        Task task = new Task(1, 1, "parent", "taskname", new Date(), new Date(), 2, false);
        when(taskDao.updateTask(task)).thenReturn(task);
         
        
        try {
        	Task task1 = taskDao.updateTask(task);
        	assertEquals(task, task1);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("The exception is : " + e);
			e.printStackTrace();
		}
        
    }
    
     
    @Test
    public void testGetTasks() 
    {
        // given
    	Task task1 = new Task(1, 1, "parent", "taskname", new Date(), new Date(), 2, false);
    	Task task2 = new Task(2, 2, "parent1", "taskname1", new Date(), new Date(), 3, true);
        ArrayList<Task> list = new ArrayList<Task>();
        list.add(task1);
        list.add(task2);
 
        when(taskDao.getTasks()).thenReturn(list);
 
        // when
        List<Task> result = taskDao.getTasks();
 
        // then
        assertEquals(result.size(), list.size());
        assertEquals(result.get(0).getTaskName(), list.get(0).getTaskName());
    }
    
    @Test
    public void testGetTask() throws ParseException 
    {
        // given
    	int taskId = 31;
    	try {
		Task task = new Task(31, 30, "Parent", "Task1", new SimpleDateFormat("yyyy-MM-dd").parse("2018-11-30"), new SimpleDateFormat("yyyy-MM-dd").parse("2017-11-30"), 12, false);
    
        when(taskDao.getTask(taskId)).thenReturn(task);
 
        // when
        Task result = taskDao.getTask(taskId);
        
        // then
        assertEquals(result.getTaskName(), task.getTaskName());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
       
    }

}
