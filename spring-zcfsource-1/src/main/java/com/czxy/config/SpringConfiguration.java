package com.czxy.config;

import com.czxy.condition.MyCondition;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @author zouchangfu@163.com
 * @version 1.0
 * @date 2019/9/9
 */
@ComponentScan("com.czxy")
public class SpringConfiguration {
}
