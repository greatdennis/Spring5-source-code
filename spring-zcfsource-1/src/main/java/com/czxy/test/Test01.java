package com.czxy.test;

import com.czxy.beanpostprocessor.TestFactoryProcessor;
import com.czxy.compoents.PersonService;
import com.czxy.config.SpringConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zouchangfu@163.com
 * @version 1.0
 * @date 2019/9/9
 */
public class Test01 {
	public static void main(String[] args) {
		//这个构造方法会把Spring所有的环境都准备好
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		//注意在调试的时候:假设你在下面的代码里面找到了对象的方法,当你在此重启的时候先把那个方法的断点去掉先
		//等断点停在 ac.getBean(PersonService.class);这里的时候,在进入大断点
		//所以它的本质是map.get()   ,因此证明Spring初始化的时候已经把目标代理好了
		ac.register(SpringConfiguration.class);
		ac.addBeanFactoryPostProcessor(new TestFactoryProcessor());
		ac.refresh();
		PersonService proxyPerson = ac.getBean(PersonService.class);
		proxyPerson.run();
		System.out.println("12312");
	}
}
