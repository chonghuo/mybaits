package com.bjpowernode.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bjpowernode.beans.Student;
import com.bjpowernode.dao.StudentDao;

public class MyView {

	private StudentDao dao;

	public  void test01() {
		Student student = new Student("张三", 23);
		dao.insertStudent(student);
	}
	
	public  void test02() {
		dao.deleteById(17);
	}
	
	public void test03() {
		Student student = new Student("王五", 25);
		student.setId(20);
		dao.updateStudent(student);
	}

	public  void test04() {
		Student student = new Student("高峰", 24);
		System.out.println(student);
		dao.insertStudentCatchId(student);
		System.out.println(student);
	}
	
	public void test05() {
		List<Student> stuList = dao.selectAllStudents();
		System.out.println(stuList);
	}
	
	public void test06() {
		Student student = dao.selectStudentById(24);
		System.out.println(student);
	}

	public void test07() {
		List<Student> stuList = dao.selectStudnetByName("张");
		System.out.println(stuList);
	}
	public void test08() {
		Student student = new Student("张",27);
		List<Student> studList = dao.selectStudnetByNameAndAge(student);
	    System.out.println(studList);
	}
	public void test09() {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("name", "张");
		map.put("ageTop", 27);
		map.put("ageLow", 23);
		List<Student> studList = dao.selectStudentsByCondition(map);
	    System.out.println(studList);
	}
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