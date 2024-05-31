package com.spring.learning.datajpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.learning.datajpa.config.AppConfig;
import com.spring.learning.datajpa.dao.StudentDao;
import com.spring.learning.datajpa.models.Student;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Student st = new Student();
		st.setName("narendra");
		st.setEmail("narendrarokkam145@gmail.com");
		StudentDao dao = context.getBean(StudentDao.class);
		dao.insertStudent(st);
	}
}
