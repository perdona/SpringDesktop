package br.com.springdesktop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public void run(String... args) {
		new SpringDesktop();
    }
	
    public static void main(String[] args) {
    	SpringApplication app = new SpringApplication(Application.class);
//        app.setShowBanner(false);
        app.setHeadless(false);
        app.run(args);
    }
}