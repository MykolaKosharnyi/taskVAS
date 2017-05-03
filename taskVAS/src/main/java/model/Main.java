package model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.external_service.FunDialService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-configuration.xml");
		FunDialService funDialService = (FunDialService) context.getBean("funDialService");
		String textSong = funDialService.findMusic("song1");
		System.out.println("Text song : " + textSong);
	}

}
