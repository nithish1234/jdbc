package com.application.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DAO.DaoLayer;
import com.application.model.SampleModel;

@RestController
@RequestMapping("/test")
public class TestController {

	@PostMapping("/save")
	public void detialsOfUser(@RequestBody SampleModel sampleModel) {
		
		DaoLayer daoLayer = new DaoLayer();
		daoLayer.getBook(sampleModel);

	}
}