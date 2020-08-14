package com.techelevator;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import com.techelevator.domain.Student;


public class ClientApp {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String BASE_URL = "http://localhost:8080";
	    RestTemplate restTemplate = new RestTemplate();
		
		Student[] students = restTemplate.getForObject(BASE_URL + "/students", Student[].class);
		
		for (Student s: students) {
			System.out.println(s.getFirstName() + " " + s.getLastName());
		}
		
		
		
		
		Student student = new Student();
		student.setCohort("11");
		student.setSection("JG");
		student.setFirstName("Joe");
		student.setEmail("steve@te.com");
		student.setLastName("C");
		student.setPhone("555-555-5555");


		HttpHeaders headers = new HttpHeaders(); // this creates an object that represents the HTTP Header
		headers.setContentType(MediaType.APPLICATION_JSON); // server api will document required/optional header
															// information - in this case we want JSON!

		HttpEntity<Student> entity = new HttpEntity(student, headers); // package of our data and header info

		Student studentRes = null;
		
		
		
		try {
			studentRes = restTemplate.postForObject(BASE_URL + "/students", entity, Student.class);
			System.out.println(studentRes.getId() + ":  " + studentRes.getFirstName() + " " + studentRes.getLastName());
		} 
		catch (RestClientResponseException ex) {
			System.out.println(ex.getRawStatusCode() + ": " + ex.getStatusText() + " " + ex.getMessage());
		} 
		catch (ResourceAccessException ex1) {
			System.out.println("" + ex1.getMessage());
		}		
		
		
		
		
		

	}

}
