package com.softech.theOrdering;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class WebservicesSpringJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebservicesSpringJpaApplication.class, args);
	}
	//configuring default locale  
	@Bean  
	public  LocaleResolver localeResolver()  
	{  
	SessionLocaleResolver localeResolver = new SessionLocaleResolver();  
	localeResolver.setDefaultLocale(Locale.US);  
	return localeResolver;  
	}  
	//configuring ResourceBundle  
	@Bean  
	public ResourceBundleMessageSource messageSource()  
	{  
	ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();  
	messageSource.setBasename("messages");  
	return messageSource;  
	}  
}
