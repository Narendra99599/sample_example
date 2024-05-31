package com.spring.learning.datajpa.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.learning.datajpa.models.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component("studentDaoImp")
public class StudentDaoimp implements StudentDao {

	@PersistenceContext
	EntityManager em;

	
	@Transactional
	public int insertStudent(Student st) {
		em.persist(st);
		return 1;
	}
}
