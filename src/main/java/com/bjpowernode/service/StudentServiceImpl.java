package com.bjpowernode.service;

import com.bjpowernode.beans.Student;
import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.dao.StudentDaoImpl;

public class StudentServiceImpl implements StudentService {
	private StudentDao dao = new StudentDaoImpl();
	
	@Override
	public void addStudent(Student student) {
		dao.insertStudent(student);
	}

}
