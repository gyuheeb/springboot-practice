package myweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
public class MyWebApplication {
	@Controller
	public class HelloController{

		@RequestMapping("/hello")
		public String hello() {
			return "hello";
		}
	}
	public static void main(String[] args) {
		SpringApplication.run(MyWebApplication.class,args);
	}
}