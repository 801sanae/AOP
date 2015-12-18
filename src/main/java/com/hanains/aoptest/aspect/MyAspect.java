package com.hanains.aoptest.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	
	//joinpoint when? 
	//Before
	@Before("execution( com.hanains.aoptest.vo.ProductVo com.hanains.aoptest.service.ProductService.findProduct(String))") //target
	public void before(){
		System.out.println(this.getClass()+".before() called");
	}
	
	//joinpoint when?
	//After
	@After("execution( * com.hanains.aoptest.service.ProductService.findProduct(..))") //target
	public void after(){
		System.out.println(this.getClass()+".after() called");
	}
	
	//joinpoint when?
	//Round
	@Around("execution( * com..ProductService.findProduct(..))") //target
	public Object around(ProceedingJoinPoint pjp)throws Throwable{
		
		System.out.println(this.getClass()+"around.before() called");
	/*
		Object[] parmas = {"Camera"};
		
		Object res = pjp.proceed(parmas);// 데이터변경
	*/	
		Object res = pjp.proceed();
		
		System.out.println(this.getClass()+"around.after() called");
		
		return res;		
		
	}
	
	//joinpoint when?
	//AfterReturning
	@AfterReturning("execution( * com..*.findProduct(..))") //target
	public void afterReturning(){
		System.out.println(this.getClass()+".afterReturning() called");
	}
	
	//joinpoint when?
	//AfterThrowing
	@AfterThrowing(value="execution( * com..*.*(..))",throwing="ex") //target
	public void afterThrowing(Throwable ex){
		System.out.println(this.getClass()+".afterThrowing() called : " +ex);
	}
}
