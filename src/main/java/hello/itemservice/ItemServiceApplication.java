package hello.itemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}

	/**
	 * 스프링 부트 사용 - MessageSource 를 자동으로 스프링 빈으로 등록.
	 *
	   @Bean
	   public MessageSource messageSource() {
	 	   ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();

	       messageSource.setBasenames("messages", "errors");
	 	   messageSource.setDefaultEncoding("utf-8");

	       return messageSource;
	   }
	 */

}
