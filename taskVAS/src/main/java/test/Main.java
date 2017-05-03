package test;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Song;
import model.VASService;

/**
 * 
 * @author  Nikolay Kosharnyi
 * 
 * Class for testing if all go fine.
 *
 */
public class Main {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("spring-configuration.xml");
		VASService vasService = (VASService) context.getBean("vasService");
		List<Song> sngs = vasService.getMelody("song1");
		
		for(Song song : sngs){
			System.out.println(song);
		}
		
	}

}
