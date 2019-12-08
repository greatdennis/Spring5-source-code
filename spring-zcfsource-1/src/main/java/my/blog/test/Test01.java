package my.blog.test;

import my.blog.compoents.PersonService;
import my.blog.compoents.PersonService3;
import my.blog.config.SpringConfiguration;
import my.blog.dao.PersonDao;
import my.blog.dao.imp.PersonDaoImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.URL;

/**
 * @author zcf13543354971@163.com
 * @version 1.0
 * @date 2019/9/9
 */
public class Test01 {
	public static void main(String[] args) {
		//这个构造方法会把Spring所有的环境都准备好
		//Spring@ComponentScan扫描类的过程?
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		SpringConfiguration springConfiguration = (SpringConfiguration) ac.getBean("springConfiguration");

	}
}
