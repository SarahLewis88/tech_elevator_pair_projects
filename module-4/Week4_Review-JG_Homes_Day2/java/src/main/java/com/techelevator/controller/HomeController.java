package com.techelevator.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.dao.HomeDAO;
import com.techelevator.model.Home;


@RestController
@CrossOrigin
@PreAuthorize("isAuthenticated()")
public class HomeController {
	
	private HomeDAO homeDAO;
	
    public HomeController(HomeDAO homeDAO) {

        this.homeDAO = homeDAO;
    }	
    
    @PreAuthorize("permitAll")
	@RequestMapping(path = "/homes", method = RequestMethod.GET)
	public List<Home> getHomes() {
		return homeDAO.getHomes();
	} 
	
 //   @PreAuthorize("hasRole('ROLE_ADMIN')")
//	@ResponseStatus(HttpStatus.CREATED)
//	@RequestMapping(path = "/homes", method = RequestMethod.POST)
//	public void addHome(@RequestBody Home home, Principal principle) {
//		String userName = principle.getName();
//		homeDAO.addHome(home, userName);
//	}
    
    
 
   	@ResponseStatus(HttpStatus.CREATED)
   	@RequestMapping(path = "/homes", method = RequestMethod.POST)
   	public void addHome(@RequestBody Home home) {
   		homeDAO.addHome(home);
   	}

}

