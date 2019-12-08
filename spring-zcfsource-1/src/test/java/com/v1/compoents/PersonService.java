package com.v1.compoents;

import my.blog.compoents.PersonService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author zcf13543354971@163.com
 * @version 1.0
 * @date 2019/9/12
 */
@Component
public class PersonService {
	public PersonService() {
		System.out.println("personService构造方法执行了");
	}
	@PostConstruct
	public void init(){
		System.out.println("init方法执行了");
	}
}
