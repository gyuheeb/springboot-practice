package ex03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootConfiguration
@ComponentScan			//부트스트랩클래스의 위치가 중요 ...하부
public class MyApplication {
	public static void mait(String[] args) {
		try(ConfigurableApplicationContext ac =SpringApplication.run(MyApplication.class,args)){}
	}
}
