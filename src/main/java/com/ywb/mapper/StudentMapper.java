package com.ywb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;

import com.ywb.bean.Student;

public interface StudentMapper {

	@Select("SELECT * FROM student")
	List<Student> queryAll();
	
	@Select("SELECT * FROM student where name = #{name}")
	Student queryById(String name);
	
	@Insert("INSERT INTO student (name, age) VALUES (#{name}, #{age})")	
	void Insert(Student student);
	
}
