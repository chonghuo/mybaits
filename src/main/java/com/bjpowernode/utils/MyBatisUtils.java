package com.bjpowernode.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtils {
	
	private static SqlSessionFactory  factory;
    
	//工具类中方法的异常要抛出,不能try-catch
	public static SqlSession getSqlSession() throws IOException{
		
		if(factory == null) {
			InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
			factory = new SqlSessionFactoryBuilder().build(inputStream);
		}
		SqlSession session = factory.openSession();
		return session;
	}
}
