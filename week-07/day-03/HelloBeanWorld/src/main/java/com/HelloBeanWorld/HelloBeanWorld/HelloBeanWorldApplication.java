package com.HelloBeanWorld.HelloBeanWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloBeanWorldApplication implements CommandLineRunner, MyColor{

	public static void main(String[] args) {
		SpringApplication.run(HelloBeanWorldApplication.class, args);
	}

	@Autowired
	Printer printer;

	@Autowired
	RedColor color;

	@Override
	public void run(String... args) throws Exception {
		printer.log("hello");
	}

	@Override
	public void printColor() {
		color.printColor();
	}
}
