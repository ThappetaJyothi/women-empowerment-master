package com.capgemini.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.capgemini.model.TrainingCourse;
import com.capgemini.repository.ITrainingCourseRepository;


@Service
public class ITrainingCourseService implements TrainingServices {
	private static final Logger LOG = LoggerFactory.getLogger(ITrainingCourseService.class);
	@Autowired
  ITrainingCourseRepository trainrepo;

	@Override
	public TrainingCourse addTrainingCourse(TrainingCourse course) {
//		if(trainrepo.equals(course.getCourseName())) {
//			throw new 
//		}
		 return trainrepo.save(course);
		//return null;
	}

	@Override
	public TrainingCourse updateTrainingCourse(TrainingCourse course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TrainingCourse viewTrainingCourse(int courseId) {
		LOG.info("trainig course");
		Optional<TrainingCourse> tcOpt = trainrepo.findById(courseId);
		return tcOpt.get();
	}

	@Override
	public List<TrainingCourse> viewAllTrainingCourse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTrainingCourse(int courseId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewByTrainingCourseName(String courseName) {
		// TODO Auto-generated method stub
		
	}

}

