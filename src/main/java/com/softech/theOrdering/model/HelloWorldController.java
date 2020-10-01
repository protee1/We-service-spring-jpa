package com.softech.theOrdering.model;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@Configuration
@RestController
public class HelloWorldController {
	
	@Autowired   
	private MessageSource messageSource; 
     @GetMapping("/hello-world")
	public String HelloWorld() {
		return "HelloWOrld";
	}
     @GetMapping("/hello-world-bean")
     public HelloWorldBean helloworldBean() {
    	 return new HelloWorldBean("Hello world");
     }
     @GetMapping(path="/hello-world/path-variable/{name}")
     public HelloWorldBean helloWorldPathValiable(@PathVariable String name) {
         return new HelloWorldBean(String.format("Hello World,%s", name));

     }
     
   //internationalization  
     @GetMapping(path="/hello-world-internationalized")  
     public String helloWorldInternationalized(@RequestHeader(name="Accept-Language", required=false) Locale locale)  
     {  
     return messageSource.getMessage("good.morning.message", null, locale);  
     }  
}
