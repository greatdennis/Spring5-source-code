package com.v1.Test;

import com.v1.compoents.PersonService;
import com.v1.config.SpringConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zouchangfu
 * @version 1.0
 * @date 2019/12/7 19:57
 */
public class Test01 {
	public static void main(String[] args) {
		//这个构造方法会把Spring所有的环境都准备好
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
	}
}
