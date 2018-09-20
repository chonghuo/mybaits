package com.bjpowernode.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bjpowernode.beans.Student;
import com.bjpowernode.utils.MyBatisUtils;

public class StudentDaoImpl implements StudentDao{
	
	private SqlSession session;

	@Override
	public void insertStudent(Student student) {
		try {
			// 1.创建SQL session对象
			session = MyBatisUtils.getSqlSession();
			// 2. 操作
			session.insert("xxx.insertStu", student);     
			// 3. 提交
			session.commit();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(session !=null) {
				session.close();	
			}
		}
	}

}
