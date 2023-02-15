package ex02;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 
 * Spring Test Integration
 * 
 * SpringBoot Test Integration(@SpringBootTest)에서는 
 * 자동 스캔을 위해서는 설정클래스에 @SringbootConfiguration을 달고 있어야 한다.
 * 
 */
@SpringBootTest
public class MyApplicationTest {
	@Autowired
	private MyComponent myConponent;
	
	@Test
	public void myComponentNotNull() {
		assertNotNull(myConponent);
	}
}
