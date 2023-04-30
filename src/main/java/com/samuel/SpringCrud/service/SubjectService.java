package com.samuel.SpringCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samuel.SpringCrud.bean.Subject;
import com.samuel.SpringCrud.repository.SubjectRepository;

@Service
public class SubjectService 
{
	@Autowired
	private SubjectRepository subjectRepo;
	
	public List<Subject> getAllSubjects()
	{
		List<Subject>subjects = new ArrayList<>();
		subjectRepo.findAll().forEach(subject->subjects.add(subject));//subjects::add
		return subjects;
	}
	
	public void addSubject(Subject subject) 
	{	
		subjectRepo.save(subject);
		
	}

	public void updateSubject(Integer id, Subject subject) 
	{
		subjectRepo.save(subject);
	}

	public void deleteSubject(Integer id) 
	{
		subjectRepo.deleteById(id);
	}
	
	
	
	
	
	

}
