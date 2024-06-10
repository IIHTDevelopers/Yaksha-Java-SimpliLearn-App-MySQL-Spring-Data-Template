package com.simplilearn.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	// write your code for custom query method to enroll a student from a specified
	// course

	// write your code for custom query method to unenroll a student from a
	// specified course
}
