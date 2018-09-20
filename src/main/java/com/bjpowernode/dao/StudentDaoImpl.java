package com.bjpowernode.dao;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
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
			session.insert("insertStu", student);     
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

	@Override
	public void deleteById(int id) {
		try {
			// 1.创建SQL session对象
			session = MyBatisUtils.getSqlSession();
			// 2. 操作
			session.insert("deleteById", id);     
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

	@Override
	public void updateStudent(Student student) {
		try {
			// 1.创建SQL session对象
			session = MyBatisUtils.getSqlSession();
			// 2. 操作
			session.insert("updateStudent", student);     
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

	@Override
	public void insertStudentCatchId(Student student) {
		try {
			// 1.创建SQL session对象
			session = MyBatisUtils.getSqlSession();
			// 2. 操作
			session.insert("insertStuCatchId", student);     
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

	@Override
	public List<Student> selectAllStudents() {
		List<Student> stuList =null;
		try {
			// 1.创建SQL session对象
			session = MyBatisUtils.getSqlSession();
			// 2. 操作
			stuList = session.selectList("selectAllStudents");     
			// 3. 提交
			session.commit();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(session !=null) {
				session.close();	
			}
		}
		return stuList;
	}

	@Override
	public Student selectStudentById(Integer id) {
		Student student = null;
		try {
			// 1.创建SQL session对象
			session = MyBatisUtils.getSqlSession();
			// 2. 操作
			student = session.selectOne("selectStudentById",id);     
			// 3. 提交
			session.commit();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(session !=null) {
				session.close();	
			}
		}
		return student;
	}

	@Override
	public List<Student> selectStudnetByName(String name) {
		List<Student> stuList = null;	
		try {
				session = MyBatisUtils.getSqlSession();
				stuList = session.selectList("selectStudentsByName",name);
				session.commit();
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				if(session !=null) {
					session.close();
				}
			}
		return stuList;
	}
	@Override
	public List<Student> selectStudnetByNameAndAge(Student student) {
		List<Student> stuList = null;	
		try {
				session = MyBatisUtils.getSqlSession();
				stuList = session.selectList("selectStudentsByNameAndAge",student);
				session.commit();
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				if(session !=null) {
					session.close();
				}
			}
		return stuList;
	}
	
	@Override
	public List<Student> selectStudentsByCondition(Map<String, Object> map) {
		List<Student> students = null;
		try {
			// 1. 创建SqlSession对象
			session = MyBatisUtils.getSqlSession();
			// 2. 操作
			students = session.selectList("selectStudentsByCondition", map);
			// 3. 提交
			session.commit();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4. 关闭
			if (session != null) {
				session.close();
			}
		}
		return students;
	}

	@Override
	public List<Student> selectStudentsByCondition2(Map<String, Object> map) {
		List<Student> students = null;
		try {
			// 1. 创建SqlSession对象
			session = MyBatisUtils.getSqlSession();
			// 2. 操作
			students = session.selectList("selectStudentsByCondition2", map);
			// 3. 提交
			session.commit();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4. 关闭
			if (session != null) {
				session.close();
			}
		}
		return students;
	}



}
