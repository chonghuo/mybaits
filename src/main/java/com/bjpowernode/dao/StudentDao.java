package com.bjpowernode.dao;

import java.util.List;
import java.util.Map;

import com.bjpowernode.beans.Student;

public interface StudentDao {
	
	void insertStudent(Student student);
	void insertStudentCatchId(Student student);
	void deleteById(int id);
	void updateStudent(Student student);
	List<Student> selectAllStudents();
	Student selectStudentById(Integer id);
	List<Student> selectStudnetByName(String name);
	List<Student> selectStudnetByNameAndAge(Student student);
	List<Student> selectStudentsByCondition(Map<String,Object> map);
	List<Student> selectStudentsByCondition2(Map<String,Object> map);
	

}
