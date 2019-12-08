package my.blog.compoents;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author zcf13543354971@163.com
 * @version 1.0
 * @date 2019/9/12
 */
@Component
public class PersonService {


	@Autowired
	PersonService2 personService2;
}
