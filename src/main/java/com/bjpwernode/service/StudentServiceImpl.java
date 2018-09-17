package com.bjpwernode.service;

import com.bjpwernode.beans.Student;
import com.bjpwernode.dao.StudentDao;
import com.bjpwernode.dao.StudentDaoImpl;

public class StudentServiceImpl implements StudentService {
	private StudentDao dao = new StudentDaoImpl();
	
	@Override
	public void addStudent(Student student) {
		dao.insertStudent(student);
	}

}
