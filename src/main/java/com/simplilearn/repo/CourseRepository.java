package com.simplilearn.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

	// write your code for method to find all courses by title in ascending order

	// write your code for method to find all courses by title in ascending order
	// and it must return data in pages
}
