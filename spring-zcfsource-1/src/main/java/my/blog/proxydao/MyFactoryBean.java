package my.blog.proxydao;

import com.sun.org.apache.bcel.internal.generic.Select;
import my.blog.dao.PersonDao;
import my.blog.myinterface.MySelect;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author zcf13543354971@163.com
 * @version 1.0
 * @date 2019/9/16
 */

public class MyFactoryBean implements FactoryBean, InvocationHandler {
	Class clazz;
	public MyFactoryBean(Class clazz){
		this.clazz=clazz;
	}
	@Override
	public Object getObject() throws Exception {
		PersonDao proxy_dao = (PersonDao) Proxy.newProxyInstance(this.getClass().getClassLoader(),new Class[]{clazz},this);
		return proxy_dao;
	}

	@Override
	public Class<?> getObjectType() {
		return clazz;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		MySelect mySelect = method.getDeclaredAnnotation(MySelect.class);
		String value = mySelect.value();
		System.out.println(value);
		System.out.println("proxy代理了...");
		return null;
	}
}
