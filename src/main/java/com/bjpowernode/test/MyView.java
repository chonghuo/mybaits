package com.bjpowernode.test;

import java.util.List;

import com.bjpowernode.beans.Student;
import com.bjpowernode.dao.StudentDao;

public class MyView {

	private StudentDao dao;

	public  void test01() {
		Student student = new Student("张三", 23);
		dao.insertStudent(student);
	}
	
	public  void test02() {
		dao.deleteById(20);
	}
	
	public void test03() {
		Student student = new Student("孤军", 25);
		student.setId(20);
		dao.updateStudent(student);
	}

		
	public void test05() {
		List<Student> stuList = dao.selectAllStudents();
		System.out.println(stuList);
	}
	
	public void test06() {
		Student student = dao.selectStudentById(24);
		System.out.println(student);
	}

	
}
