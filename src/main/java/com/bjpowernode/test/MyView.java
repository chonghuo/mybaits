package com.bjpowernode.test;

import com.bjpowernode.beans.Student;
import com.bjpowernode.service.StudentService;
import com.bjpowernode.service.StudentServiceImpl;

public class MyView {

	public static void main(String[] args) {
		StudentService service = new StudentServiceImpl();
		Student student = new Student("张三", 23);
		service.addStudent(student);
	}

}
