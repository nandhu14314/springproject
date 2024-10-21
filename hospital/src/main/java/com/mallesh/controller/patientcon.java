package com.mallesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mallesh.dto.patientdto;

import com.mallesh.service.patientser;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("pdsave")
@Tag(name="patient controller class" ,description = "printed the methods ")
@Slf4j
public class patientcon {
	@Autowired
	private patientser ps;
	@PostMapping("save")
	public ResponseEntity<patientdto> save(@RequestBody @Valid patientdto p)
	{
		
		return ps.save(p);
	}
	@GetMapping("getbyname")
	public ResponseEntity<Object> getbyname(@RequestParam @Valid  String pname)
	{
		return ps.getbyname(pname);
	}

}
