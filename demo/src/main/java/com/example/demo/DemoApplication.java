package com.example.demo;

import java.io.IOException;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		Game game = (Game) context.getBean("game");
		game.play();

		Movie movie = (Movie) context.getBean("movie");
		movie.play();

		Music music = (Music) context.getBean("music");
		music.play();

		ImageUtil imageUtil = (ImageUtil) context.getBean("imageUtil");
		imageUtil.save("http://ggoreb.com/images/luffy.jpg");

		((AnnotationConfigApplicationContext) context).close();
	}

}
