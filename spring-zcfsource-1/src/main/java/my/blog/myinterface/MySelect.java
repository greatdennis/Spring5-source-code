package my.blog.myinterface;

import org.springframework.beans.factory.annotation.Value;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author zcf13543354971@163.com
 * @version 1.0
 * @date 2019/9/17
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MySelect {
	 String  value ();
}
