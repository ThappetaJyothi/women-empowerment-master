package com.capgemini.service;

import java.util.List;

import com.capgemini.model.TrainingCourse;

public interface TrainingServices {
		
		
		TrainingCourse addTrainingCourse(TrainingCourse course);

		TrainingCourse updateTrainingCourse(TrainingCourse course);

		TrainingCourse viewTrainingCourse(int courseId);

		List<TrainingCourse> viewAllTrainingCourse();

		void deleteTrainingCourse(int courseId);

		void viewByTrainingCourseName(String courseName);

	}



