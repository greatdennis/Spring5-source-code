package my.blog.myimport;

import my.blog.compoents.PersonService3;
import my.blog.myaop.MyAop;
import my.blog.myinterface.EnableCzxy;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.MethodMetadata;
import org.springframework.util.MultiValueMap;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * @author zcf13543354971@163.com
 * @version 1.0
 * @date 2019/9/17
 */
public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{MyAop.class.getName()};
	}
}
