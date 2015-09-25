package br.com.springdesktop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
    public static void main(String[] args) {
    	SpringApplication app = new SpringApplication(SpringDesktop.class);
//        app.setShowBanner(false);
        app.setHeadless(false);
        app.run(args);
    }
}