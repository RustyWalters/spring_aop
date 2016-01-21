package com.caveofprogramming.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Aspect
@Component
public class Logger {
	
	@Pointcut("args(exposure, aperture)")  
	public void somePointcut(int exposure, double aperture) {
		
	}
	
	@Pointcut("target(com.caveofprogramming.spring.aop.Camera)")  
	public void targetCamera() {
		
	}

		
	@Before("targetCamera() && somePointcut(exposure, aperture)")
	public void somePointcutDemo(JoinPoint jp, int exposure, double aperture ) {
		System.out.println("*********Before demo*********");
		System.out.printf("exposure %d, aperture %.2f\n", exposure, aperture);
	}			
	
	@After("within(com.caveofprogramming.spring.aop.*) && !@annotation(Deprecated)")
	public void someAfterAdvice() {
		System.out.println("After advice running!!!!!!!!!!!!!!!!!!!!!!1");
	}
	
//	@Pointcut("target(com.caveofprogramming.spring.aop.Camera)")  
//	public void somePointcut() {
//		
//	}
	
	
//	@Pointcut("@args(java.lang.Deprecated)")  
//	public void somePointcut() {
//		
//	}
//	
//	@Before("somePointcut()")
//	public void somePointcutDemo() {
//		System.out.println("*********Before demo*********");
//	}			
	
//	@Pointcut("@annotation(java.lang.Deprecated)")  
//	public void somePointcut() {
//		
//	}
//	
//	@Before("somePointcut()")
//	public void somePointcutDemo() {
//		System.out.println("*********Before demo*********");
//	}		
	
//	@Pointcut("@target(org.springframework.stereotype.Component)")  
//	public void somePointcut() {
//		
//	}
//	
//	@Before("somePointcut()")
//	public void somePointcutDemo() {
//		System.out.println("*********Before demo*********");
//	}	
	
//	@Pointcut("within(@org.springframework.stereotype.Component com.caveofprogramming.spring..*)")
//	public void somePointcut() {
//		
//	}
//	
//	@Before("somePointcut()")
//	public void somePointcutDemo() {
//		System.out.println("*********Before demo*********");
//	}	
	
//	@Pointcut("within(com.caveofprogramming.spring..*)")
//	public void withinDemo() {
//		
//	}
//	
//	@Pointcut("target(com.caveofprogramming.spring.aop.ICamera)")
//	public void targetDemo() {
//		
//	}
//	
//	@Pointcut("this(com.caveofprogramming.spring.aop.ICamera)")
//	public void thisDemo() {
//		
//	}
	
//	@Pointcut("execution(* com.caveofprogramming.spring.aop.Camera.snap())")
//	public void cameraSnap() {
//		
//	}
	
//	@Pointcut("execution(* com.caveofprogramming.spring.aop.Camera.snap(String))")
//	public void cameraSnapName() {
//		
//	}	
//	
//	@Pointcut("execution(* *.*(..))")
//	public void cameraRelatedAction() {
//		
//	}		
	
//	@Before("withinDemo()")
//	public void withinDemoAdvice() {
//		System.out.println("*********Before demo*********");
//	}
//	
//	@Before("targetDemo()")
//	public void targetDemoAdvice() {
//		System.out.println("*********Target demo*********");
//	}
//	
//	@Before("thisDemo()")
//	public void thisDemoAdvice() {
//		System.out.println("*********This demo*********");
//	}

//	@After("cameraSnap()")
//	public void afterAdvice() {
//		System.out.println("After advice...");
//	}
//	
//	@AfterReturning("cameraSnap()")
//	public void afterReturningAdvice() {
//		System.out.println("After returning advice...");
//	}	
//	
//	@AfterThrowing("cameraSnap()")
//	public void afterThrowingAdvice() {
//		System.out.println("After throwing advice...");
//	}		
//	
//	@Around("cameraSnap()")
//	public void aroundAdvice(ProceedingJoinPoint p) {
//		System.out.println("Around advice (before)...");
//		try {
//			p.proceed();
//		} catch (Throwable e) {
//			System.out.println("In around advice: " + e.getMessage());
//		}
//		
//		System.out.println("Around advice (after)...");
//	}			
	
	//	@Before("cameraSnap()")
//	public void aboutToTakePhoto() {
//		System.out.println("About to take photo...");
//	}
//	
//	@Before("cameraSnapName()")
//	public void aboutToTakePhotoWithName() {
//		System.out.println("About to take photo with name...");
//	}	
//	
//	@Before("cameraRelatedAction()")
//	public void aboutToDoCameraRelatedAction() {
//		System.out.println("Doing something related to cameras...");
//	}	
}
