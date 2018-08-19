package com.anony.main.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebDecripterInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{

	final String MAPPING_ONE="*.pag";
	final String MAPPING_TWO="*.htm";
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		System.out.println("get root config classs");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		
		System.out.println("get servlet config classs");
		return new Class[] { DispatcherServletInitializer.class };
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		System.out.println("get servlet mapping");
		return new String[] { MAPPING_ONE , MAPPING_TWO  };
	}

}
