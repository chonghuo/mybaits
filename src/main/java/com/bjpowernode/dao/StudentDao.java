package com.bjpowernode.dao;

import java.util.List;
import java.util.Map;

import com.bjpowernode.beans.Student;

public interface StudentDao {
	
	List<Student> selectStudentsByIf(Map<String,Object> map);
	
	List<Student> selectStudentsByWhere(Map<String,Object> map);
	
	List<Student> selectStudentsByChoose(Map<String,Object> map);
	
	List<Student> selectStudentsByForeach(int[] ids);
	
	List<Student> selectStudentsByForeach2(List<Integer> idList);
	
	List<Student> selectStudentsByForeach3(List<Student> stus);
	
	List<Student> selectStudentsBySql(List<Student> stus);

	List<Student> selectStudentsBySql2(List<Student> stus);
}
