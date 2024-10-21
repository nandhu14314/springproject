package com.mallesh.exception;

import java.sql.SQLException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
@Component
public class pexceptions {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<String> validationrelated(MethodArgumentNotValidException m)
	{
		
		return new ResponseEntity<String>(m.getMessage()+"---seriveces exption---",HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(SQLException.class)
	public ResponseEntity<String> getbygmail(SQLException m)
	{
		
		return new ResponseEntity<String>(m.getMessage()+"----sql expetion----",HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> getbygmail(Exception m)
	{
		
		return new ResponseEntity<String>(m.getMessage()+"---database expetion---",HttpStatus.BAD_REQUEST);
	}



}
