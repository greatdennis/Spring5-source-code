package my.blog.test;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import my.blog.config.SpringConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zouchangfu
 * @version 1.0
 * @date 2019/12/7 19:03
 */
public class Test03 {
	public static void main(String[] args) {
		//这个构造方法会把Spring所有的环境都准备好
		//Spring@ComponentScan扫描类的过程?
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		SpringConfiguration springConfiguration = (SpringConfiguration) ac.getBean("springConfiguration");
		System.out.println(springConfiguration);
	}
}
