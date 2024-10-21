package com.mallesh.dao;


import java.util.Optional;

import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.mallesh.dto.patientdto;

import com.mallesh.entity.patient;
import com.mallesh.serviceimpl.patientservimpl;

import lombok.extern.slf4j.Slf4j;
@Component
@Slf4j
public class patientdao {
	@Autowired
	private patientservimpl pil;

	public ResponseEntity<patientdto> save(patientdto p) {
		
		
		
		 ModelMapper mp=new ModelMapper();
		 patient pm=mp.map(p, patient.class);
		
		pil.save(pm);
		
		return new ResponseEntity<patientdto>(p,HttpStatus.CREATED);
	}

	public ResponseEntity<Object> getbyname(String name) {
		Optional<patient> pe=	pil.findByPname(name);
		System.out.println(pe);
	      
	 return new ResponseEntity<Object>(pe,HttpStatus.CREATED);
	}

}
