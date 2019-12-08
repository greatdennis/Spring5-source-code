package my.blog.dao.imp;

import my.blog.dao.PersonDao;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author zcf13543354971@163.com
 * @version 1.0
 * @date 2019/9/17
 */
//@Component
public class PersonDaoImpl implements PersonDao {
	@Override
	public void run() {
		System.out.println("personDao");
	}
}
