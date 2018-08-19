package com.anony.main.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;



@Configuration
@EnableWebMvc
@ComponentScan( basePackages = "com.anony.main")
public class DispatcherServletInitializer implements WebMvcConfigurer
{

	
	@Bean
	public InternalResourceViewResolver getViewResolver()
	{
		System.out.println("in internal resource view resolver");
		
		final String prefix="/WEB-INF/frontViews/";
		final String suffix=".jsp";
		
		InternalResourceViewResolver viewresolver = new InternalResourceViewResolver();
		
		viewresolver
					.setPrefix(prefix);
		viewresolver
					.setSuffix(suffix);
		
		
		return viewresolver;
	}
	
	
}
