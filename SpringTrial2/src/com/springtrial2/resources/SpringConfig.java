package com.springtrial2.resources;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.context.annotation.Bean;

import com.springtrial2.beans.Student;

@CacheConfig
public class SpringConfig {
	
	@Bean
	public Student student1() {
		Student stdStudent = new Student();
		stdStudent.setName("Durga");
		stdStudent.setEmail("Durga@gmail.com");
		stdStudent.setRollno(101);
		return stdStudent;
	}
	@Bean
	public Student student2() {
		Student stdStudent = new Student();
		stdStudent.setName("Abhi");
		stdStudent.setEmail("Abhijeet@gmail.com");
		stdStudent.setRollno(102);
		return stdStudent;
	}
	
	@Bean("student3")
	public Student createstudent3Student() {
		Student stdStudent = new Student();
		stdStudent.setName("Magnus");
		stdStudent.setEmail("Magnus@gmail.com");
		stdStudent.setRollno(103);
		return stdStudent;
	}
}
