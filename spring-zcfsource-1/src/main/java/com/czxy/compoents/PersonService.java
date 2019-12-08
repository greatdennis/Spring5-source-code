package com.czxy.compoents;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author zouchangfu@163.com
 * @version 1.0
 * @date 2019/9/12
 */
//@Component
public class PersonService implements ApplicationContextAware {

	public ApplicationContext beanFactory;

	public void run(){
		System.out.println("run方法执行了");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		beanFactory=applicationContext;
	}

}
