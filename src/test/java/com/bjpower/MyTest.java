package com.bjpower;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.bjpowernode.beans.Student;
import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.dao.StudentDaoImpl;

public class MyTest {

	private StudentDao dao;
	
	//该方法一般用于构建测试方法的执行环境
	@Before
	public void before() {
		dao = new StudentDaoImpl();
		System.out.println("=============================================================================");
	}
	
	@After
	public void after() {
		System.out.println("=============================================================================");
	}
	
	@Test
	public  void test01() {
		Student student = new Student("袁鹏", 23);
		dao.insertStudent(student);
	}
    @Test	
	public  void test02() {
		dao.deleteById(20);
	}
    @Test
    public void test03() {
		Student student = new Student("孤军", 25);
		student.setId(21);
		dao.updateStudent(student);
	}
    
    @Test
    public void test05() {
		List<Student> stuList = dao.selectAllStudents();
		System.out.println(stuList);
	}
    @Test
    public void test06() {
		Student student = dao.selectStudentById(24);
		System.out.println(student);
	}




}
