package my.blog.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author zcf13543354971@163.com
 * @version 1.0
 * @date 2019/9/20
 */
public class MyLambdaTest {

	@Test
	public void ru5(){
		Integer opration = opration(100, x -> x * x);
		System.out.println(opration);
		opration(100, new MyPre<Integer>() {
			@Override
			public Integer run(Integer x) {
				return x * x ;
			}
		});
	}

	public Integer opration(Integer num,MyPre<Integer> pre){
		return pre.run(num);
	}

}
