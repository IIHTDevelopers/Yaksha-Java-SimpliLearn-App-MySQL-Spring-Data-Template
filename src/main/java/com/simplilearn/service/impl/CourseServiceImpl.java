package com.simplilearn.service.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.simplilearn.dto.CourseDTO;
import com.simplilearn.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	@Override
	public CourseDTO createCourse(CourseDTO courseDTO) {
		// write your logic here
		return null;
	}

	@Override
	public CourseDTO updateCourse(Long courseId, CourseDTO courseDTO) {
		// write your logic here
		return null;
	}

	@Override
	public boolean deleteCourse(Long courseId) {
		// write your logic here
		return false;
	}

	@Override
	public CourseDTO getCourse(Long courseId) {
		// write your logic here
		return null;
	}

	@Override
	public Page<CourseDTO> listAllCourses(Pageable pageable) {
		// write your logic here
		return null;
	}

	@Override
	public List<CourseDTO> searchCourses(String title) {
		// write your logic here
		return null;
	}
}
