package com.bjpowernode.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.bjpowernode.beans.Student;
import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.utils.MyBatisUtils;

public class MyView {

	private SqlSession session;

	private StudentDao dao;

	// 查询姓名中带张且年龄小于27
	public void test01() throws IOException {
		session = MyBatisUtils.getSqlSession();
		dao = session.getMapper(StudentDao.class);
		Map<String, Object> map = new HashMap<>();
		map.put("pname", "张");
		map.put("page", 27);
		List<Student> student = dao.selectStudentsByIf(map);
		for (Student student2 : student) {
			System.out.println(student2);
		}
		session.commit();
	}

	// 查询姓名中带张且年龄小于27
	public void test02() throws IOException {
		session = MyBatisUtils.getSqlSession();
		dao = session.getMapper(StudentDao.class);
		Map<String, Object> map = new HashMap<>();
		map.put("pname", "张");
		map.put("page", 27);
		List<Student> student = dao.selectStudentsByWhere(map);
		for (Student student2 : student) {
			System.out.println(student2);
		}
		session.commit();
	}

	// 查询姓名中带张且年龄小于27
	public void test03() throws IOException {
		session = MyBatisUtils.getSqlSession();
		dao = session.getMapper(StudentDao.class);
		Map<String, Object> map = new HashMap<>();
		map.put("pname", "张");
		map.put("page", 27);
		List<Student> student = dao.selectStudentsByChoose(map);
		for (Student student2 : student) {
			System.out.println(student2);
		}
		session.commit();
	}

	public void test04() {
		int[] ids = { 22, 28, 35 };
//		int[] ids = {};

		List<Student> students = dao.selectStudentsByForeach(ids);
		for (Student student : students) {
			System.out.println(student);
		}
	}

	public void test05() {
		List<Integer> ids = new ArrayList<>();
		ids.add(22);
		ids.add(28);
		ids.add(35);
		List<Student> students = dao.selectStudentsByForeach2(ids);
		for (Student student : students) {
			System.out.println(student);
		}
	}

	public void test06() {
		Student stu1 = new Student();
		stu1.setId(22);
		Student stu2 = new Student();
		stu2.setId(25);
		Student stu3 = new Student();
		stu3.setId(28);
		List<Student> stus = new ArrayList<>();
		stus.add(stu1);
		stus.add(stu2);
		stus.add(stu3);
		List<Student> students = dao.selectStudentsByForeach3(stus);
		for (Student student : students) {
			System.out.println(student);
		}

	}

	// sql片段
	public void test07() {
		Student stu1 = new Student();
		stu1.setId(22);
		Student stu2 = new Student();
		stu2.setId(25);
		Student stu3 = new Student();
		stu3.setId(28);
		List<Student> stus = new ArrayList<>();
		stus.add(stu1);
		stus.add(stu2);
		stus.add(stu3);
		List<Student> students = dao.selectStudentsBySql(stus);
		for (Student student : students) {
			System.out.println(student);
		}
	}

	public void test08() {
		Student stu1 = new Student();
		stu1.setId(22);
		Student stu2 = new Student();
		stu2.setId(25);
		Student stu3 = new Student();
		stu3.setId(28);
		List<Student> stus = new ArrayList<>();
		stus.add(stu1);
		stus.add(stu2);
		stus.add(stu3);
		List<Student> students = dao.selectStudentsBySql2(stus);
		for (Student student : students) {
			System.out.println(student);
		}

	}

}
