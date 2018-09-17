package com.bjpwernode.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bjpwernode.beans.Student;

public class StudentDaoImpl implements StudentDao{
	
	private SqlSession session;

	@Override
	public void insertStudent(Student student) {
		try {
			// 1. 加载主配置文件
			InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
			// 2. 创建SqlSessionFactory对象
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
			// 3. 创建SqlSession对象
			session = factory.openSession();//dirty false
			// 4. 操作
			session.insert("xxx.insertStu", student);     //dirty  true
			// 5. 提交
			session.commit();// dirty false
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(session !=null) {
				session.close();	
			}
		}
	}

}
