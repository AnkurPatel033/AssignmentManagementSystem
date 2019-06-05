package com.xworkz.assignment.entities.createAssignment;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="create_assign_table")
public class CreateAssignmentEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 546785551957354964L;
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="ASSIGN_ID")
	private int aId;
	@Column(name="COURSE")
	private String course;
	@Column(name="TOPIC")
	private String topic;
	@Column(name="DESCRIPTION")
	private String desc;
	@Column(name="DEADLINE")
	private Date date;
	@Column(name="UPLOAD_TYPE")
	private String uploadType;
	@Column(name="PIN")
	private String pin;
	
	public CreateAssignmentEntity() {
	      System.out.println("Created:"+this.getClass().getSimpleName());
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getUploadType() {
		return uploadType;
	}

	public void setUploadType(String uploadType) {
		this.uploadType = uploadType;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "CreateAssignmentEntity [aId=" + aId + ", course=" + course + ", topic=" + topic + ", desc=" + desc + ", date="
				+ date + ", uploadType=" + uploadType + ", pin=" + pin + "]";
	}
	
	 
	
	
	
	
}
