package com.hanains.aoptest.service;

import org.springframework.stereotype.Service;

import com.hanains.aoptest.vo.ProductVo;

@Service
public class ProductService {
	public ProductVo findProduct( String name ) {
		System.out.println( "finding " + name + "..." );
		
		if(1==1){
			throw new RuntimeException("find");
		}
		
		return new ProductVo( name );
	}

}
