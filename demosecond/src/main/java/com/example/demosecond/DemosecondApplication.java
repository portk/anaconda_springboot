package com.example.demosecond;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemosecondApplication {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
		int i = (int)context.getBean("bean2");
		System.out.println(i);
		Bean3 b = (Bean3)context.getBean("bean3");
		System.out.println(b.run());
		((ClassPathXmlApplicationContext) context).close();
	}
}
