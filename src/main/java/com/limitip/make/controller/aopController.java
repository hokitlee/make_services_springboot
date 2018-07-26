package com.limitip.make.controller;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class aopController {
//	@Pointcut("execution(*controller.impl.*ControllerImpl*(..))")
	@Pointcut("execution(* controller.*Controller.*(..))")
	void result() {
	}
	
	@Before("result()")
	public void clearResultBefore() {
//		baseController.result.clear();

	}
}
