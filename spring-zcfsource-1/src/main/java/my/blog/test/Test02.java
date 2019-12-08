package my.blog.test;

import my.blog.config.SpringConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zouchangfu
 * @version 1.0
 * @date 2019/9/28 9:40
 */
public class Test02 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		SpringConfiguration springConfiguration = (SpringConfiguration) ac.getBean("springConfiguration");
		System.out.println(springConfiguration);
	}
}
