package com.xworkz.assignment.services.createassign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.assignment.dao.createassign.CreateAssignmentDAO;
import com.xworkz.assignment.dto.createAssignment.CreateAssignmentDTO;
import com.xworkz.assignment.entities.createAssignment.CreateAssignmentEntity;
import com.xworkz.assignment.exceptions.DAOException;
import com.xworkz.assignment.exceptions.ServiceException;
import com.xworkz.assignment.utils.adduser.RandomGenerator;

@Service
public class CreateAssignmentServiceImp implements CreateAssignmentService{

	@Autowired
	private CreateAssignmentDAO dao;
	@Autowired
	private RandomGenerator random;
	
	
	public CreateAssignmentServiceImp() {
		System.out.println("Created:"+this.getClass().getSimpleName());
	}
	
	@Override
	public String createAssignment(CreateAssignmentDTO dto) throws ServiceException {
		
		System.out.println("Create AssignmentServiceImp() Calling");
		
		CreateAssignmentEntity entity=new CreateAssignmentEntity();
		entity.setCourse(dto.getCourse());
		entity.setTopic(dto.getTopic());
		entity.setDesc(dto.getDesc());
		entity.setDate(dto.getDate());
		entity.setUploadType(dto.getUploadType());
		
		//generate PIN for assignment
		/*
		String course=dto.getCourse().substring(0, 1);
		String topic=dto.getTopic().substring(0, 3);
		String uptype=dto.getUploadType().substring(0, 2);
		
		String pin=course+topic+uptype;*/
		String pin=random.genearteAssignmentNumber();
		entity.setPin(pin);
	    try {
	    	
			dao.createAssignment(entity);
		} catch (DAOException e) {
			System.out.println("Exception From Service:"+e.getMessage());
			 throw new ServiceException(e.getMessage());
		}
		return pin;
		
		
	}

	
	
	
}
