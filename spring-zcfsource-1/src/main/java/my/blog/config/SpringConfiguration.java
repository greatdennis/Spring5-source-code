package my.blog.config;

import my.blog.compoents.PersonService;
import my.blog.compoents.PersonService3;
import my.blog.myinterface.EnableCzxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author zcf13543354971@163.com
 * @version 1.0
 * @date 2019/9/9
 */

@ComponentScan("my.blog")
@Configuration
public class SpringConfiguration {

/*	@Bean
	public PersonService run(){
		return new PersonService();
	}

	@Bean
	public PersonService3 run2(){
		return new PersonService3();
	}*/
}
