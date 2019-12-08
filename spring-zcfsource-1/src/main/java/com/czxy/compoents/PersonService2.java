package com.czxy.compoents;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @author zcf13543354971@163.com
 * @version 1.0
 * @date 2019/9/14
 */
//@Component
public class PersonService2 implements ApplicationListener {
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println(event);
	}
}
