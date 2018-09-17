package com.bjpwernode.test;

import com.bjpwernode.beans.Student;
import com.bjpwernode.service.StudentService;
import com.bjpwernode.service.StudentServiceImpl;

public class MyView {

	public static void main(String[] args) {
		StudentService service = new StudentServiceImpl();
		Student student = new Student("张三", 23);
		service.addStudent(student);
	}

}
