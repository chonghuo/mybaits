package com.bjpower;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.bjpowernode.beans.Student;
import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.utils.MyBatisUtils;

public class MyTest {

	private StudentDao dao;
	private SqlSession session;
	
	//该方法一般用于构建测试方法的执行环境
	@Before
	public void before() throws IOException {
		session = MyBatisUtils.getSqlSession();
		dao = session.getMapper(StudentDao.class);
		System.out.println("=============================================================================");
	}
	
	@After
	public void after() {
		session.commit();
		System.out.println("=============================================================================");
	}
	
	@Test
	public  void test01() {
		Student student = new Student("立峰", 23);
		dao.insertStudent(student);
	}
    @Test	
	public  void test02() {
		dao.deleteById(24);
	}
    @Test
    public void test03() {
		Student student = new Student("孤军", 25);
		student.setId(21);
		dao.updateStudent(student);
	}
    
    @Test
    public void test05() {
		List<Student> stuList = dao.selectAllStudents();
		System.out.println(stuList);
	}
    @Test
    public void test06() {
		Student student = dao.selectStudentById(25);
		System.out.println(student);
	}




}
