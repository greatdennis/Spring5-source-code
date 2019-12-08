package my.blog.proxydao;

import my.blog.dao.PersonDao;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author zcf13543354971@163.com
 * @version 1.0
 * @date 2019/9/16
 */
//@Component
public class MyMapperScannerRegistrar implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		BeanDefinitionBuilder bdb = BeanDefinitionBuilder.genericBeanDefinition(PersonDao.class);
		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) bdb.getBeanDefinition();
		System.out.println(beanDefinition.getBeanClassName());
		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("my.blog.dao.PersonDao");
		beanDefinition.setBeanClass(MyFactoryBean.class);
		registry.registerBeanDefinition("personDao",beanDefinition);
	}
}
