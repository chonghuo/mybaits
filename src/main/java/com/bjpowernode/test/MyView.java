package com.bjpowernode.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.bjpowernode.beans.Student;
import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.utils.MyBatisUtils;

public class MyView {

	private StudentDao dao;
	private SqlSession session;

	public  void test01() throws IOException {
		session = MyBatisUtils.getSqlSession();
		dao= session.getMapper(StudentDao.class);
		Student student = new Student("张三", 23);
		dao.insertStudent(student);
		session.commit();
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
