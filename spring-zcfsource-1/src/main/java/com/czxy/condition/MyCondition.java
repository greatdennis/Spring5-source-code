package com.czxy.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author zcf13543354971@163.com
 * @version 1.0
 * @date 2019/9/14
 */
public class MyCondition implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		Environment env = context.getEnvironment();
		String system = env.getProperty("os.name");
		System.out.println("系统环境为 ==="+system);
		// 系统环境在Windows才加载该bean到容器中
		if(system.contains("linux")){
			return true;
		}
		return false;
	}
}
