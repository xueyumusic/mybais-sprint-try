package com.ywb.mybatis_spring_try;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ywb.bean.Student;
import com.ywb.mapper.StudentMapper;

@Service
public class StudentService {
	
	@Autowired
	private StudentMapper studentMapper;
	
	public void InsertNewStudent(String name, Integer age)
	{
		//加入一个新student
		Student student = new Student();
		student.setName(name);
		student.setAge(age);
		studentMapper.Insert(student);
	}
	
	public void GetAllStudent()
	{
		//查询所有学生
		List<Student> students = studentMapper.queryAll();
		for (Student student : students) {
			System.out.println("Name:" + student.getName() + "   Age:" + student.getAge().toString());
		}
	}

}
