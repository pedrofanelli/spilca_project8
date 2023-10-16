package org.example.spilca_project8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;

/**
 * Dependency Injection and Abstraction using Spring!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    	
    	
    	context.close();
    }
}
