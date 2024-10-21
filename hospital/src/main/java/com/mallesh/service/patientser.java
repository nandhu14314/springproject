package com.mallesh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mallesh.dao.patientdao;
import com.mallesh.dto.patientdto;
import com.mallesh.entity.patient;
@Service
public class patientser {
     @Autowired
	private patientdao pd;

	public ResponseEntity<patientdto> save(patientdto p) {
		
		return pd.save(p);
	}

	public ResponseEntity<Object> getbyname(String pname) {
		// TODO Auto-generated method stub
		return pd.getbyname(pname);
	} 
}
