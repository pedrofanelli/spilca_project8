package org.example.spilca_project8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;
import model.Comment;
import services.CommentService;

/**
 * Dependency Injection and Abstraction using Spring!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    	
    	Comment comment = new Comment("Nietzsche", "He who has a why can bear almost any how.");
    	
    	CommentService commentService = context.getBean(CommentService.class);
    	
    	commentService.publishComment(comment);
    	
    	context.close();
    }
}
