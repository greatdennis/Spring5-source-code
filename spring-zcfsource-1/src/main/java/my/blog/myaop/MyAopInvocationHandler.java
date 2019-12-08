package my.blog.myaop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zcf13543354971@163.com
 * @version 1.0
 * @date 2019/9/17
 */
public class MyAopInvocationHandler implements InvocationHandler {
	Object target;
	public MyAopInvocationHandler(Object target) {
		this.target=target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("我是代理方法");
		return method.invoke(target,args);
	}
}
