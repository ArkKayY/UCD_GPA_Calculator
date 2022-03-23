package com.gpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gpa.model.Grade;
import com.gpa.service.GpaService;

@RestController
public class GpaController {

	@Autowired
	private GpaService gpaService;

	@RequestMapping(value = "/compute-gpa", method = RequestMethod.POST)
	public Grade computeGPA(@RequestBody List<Grade> grade) {
		return gpaService.computeGPA(grade);
	}

}
