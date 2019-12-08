package my.blog.dao;

import my.blog.myinterface.MySelect;

/**
 * @author zcf13543354971@163.com
 * @version 1.0
 * @date 2019/9/16
 */
public interface PersonDao {
	@MySelect("select * from user where id =10")
	 void run();

}
