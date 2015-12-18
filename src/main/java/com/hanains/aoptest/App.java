package com.hanains.aoptest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hanains.aoptest.service.ProductService;

public class App 
{
	public static void main( String[] args ){
    	ApplicationContext applicationContext = 
    			new ClassPathXmlApplicationContext( "config/applicationContext.xml" );
    	
    	ProductService productService = 
                            (ProductService)applicationContext.getBean( "productService" );
    	
    	productService.findProduct( "TV" );

	}
}