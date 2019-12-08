package my.blog.myaop;

import my.blog.dao.imp.PersonDaoImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zcf13543354971@163.com
 * @version 1.0
 * @date 2019/9/17
 */
public class MyAop  implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("personDaoImpl")){
			bean = Proxy.newProxyInstance(this.getClass().getClassLoader(),
					PersonDaoImpl.class.getInterfaces(),new MyAopInvocationHandler(bean));
	 }
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}
}
