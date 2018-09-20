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
		Student student = new Student("韩璐", 23);
		System.out.println(student);
		dao.insertStudent(student);
		System.out.println(student);
	}
	@Test
	public  void test02() {
		dao.deleteById(17);
	}
	@Test
	public void test03() {
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentDate = sdf.format(new Date());
		System.out.println(currentDate);
		Student student = new Student("赵六", 25);
		student.setId(20);
		dao.updateStudent(student);
	}
	@Test
	public  void test04() {
		Student student = new Student("高峰", 24);
		System.out.println(student);
		dao.insertStudentCatchId(student);
		System.out.println(student);
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
	@Test
	public void test07() {
		List<Student> stuList = dao.selectStudnetByName("张");
		System.out.println(stuList);
	}
    @Test	
	public void test08() {
		Student student = new Student("张",27);
		List<Student> studList = dao.selectStudnetByNameAndAge(student);
	    System.out.println(studList);
	}
    @Test
    public void test09() {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("name", "张");
		map.put("ageTop", 27);
		map.put("ageLow", 23);
		List<Student> studList = dao.selectStudentsByCondition(map);
	    System.out.println(studList);
	}
    @Test
    public void test10() {
		Student stu = new Student("张",23);
		Student stu2 = new Student(null,27);
		Map<String,Object> map = new HashMap<>();
		map.put("mystu", stu);
		map.put("mystu2", stu2);
		List<Student> stuList = dao.selectStudentsByCondition2(map);
		System.out.println(stuList);
	}



}
