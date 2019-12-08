package com.v1.compoents;

import com.sun.deploy.appcontext.AppContext;
import my.blog.compoents.PersonService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.type.Scope;
import org.springframework.stereotype.Component;

/**
 * @author zcf13543354971@163.com
 * @version 1.0
 * @date 2019/9/12
 */
@Component
public class PersonService2 implements ApplicationContextAware {
   private ApplicationContext applicationContext;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
            this.applicationContext = applicationContext;
		System.out.println("全局对象:"+ applicationContext);
	}
}
