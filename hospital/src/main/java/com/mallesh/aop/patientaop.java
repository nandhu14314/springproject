package com.mallesh.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component

@Aspect
@Slf4j

public class patientaop {
	private static final Logger log= LoggerFactory.getLogger(patientaop.class);
    // Corrected pointcut expression
    @Before("execution(* com.*.*.*(..))") 
    public void stater(JoinPoint jp) {
        String className = jp.getTarget().getClass().toString();  // Corrected classname retrieval
        String methodName = jp.getSignature().getName();
       log.info(className+"started the program"+methodName);
    }

    @After("execution(* com.*.*.*(..))")  // Optional After Advice
    public void completed(JoinPoint jp) {
        String className = jp.getTarget().getClass().toString();
        String methodName = jp.getSignature().getName();
        log.info(className+"completed  the program"+methodName);
    }

}
