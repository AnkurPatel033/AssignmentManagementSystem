
package com.xworkz.assignment.services.createassign;

import com.xworkz.assignment.dto.createAssignment.CreateAssignmentDTO;
import com.xworkz.assignment.exceptions.ServiceException;

public interface CreateAssignmentService {

	
	public String createAssignment(CreateAssignmentDTO dto)throws ServiceException;
	
}
