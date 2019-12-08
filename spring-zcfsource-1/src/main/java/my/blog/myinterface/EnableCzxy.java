package my.blog.myinterface;

import my.blog.myimport.MyImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author zcf13543354971@163.com
 * @version 1.0
 * @date 2019/9/17
 */
@Retention(RetentionPolicy.RUNTIME)
@Import(MyImportSelector.class)
public @interface EnableCzxy {
	String value() default "true";
}
