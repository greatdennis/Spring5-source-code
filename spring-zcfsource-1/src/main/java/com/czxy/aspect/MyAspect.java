package com.czxy.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author zouchangfu@163.com
 * @version 1.0
 * @date 2019/9/12
 */

public class MyAspect {

	@Pointcut("execution(* com.czxy.compoents.PersonService.run())")
	public void cut(){}

	@Before("cut()")
	public void beforeRun(){
		System.out.println("run方法之前");
	}
}
