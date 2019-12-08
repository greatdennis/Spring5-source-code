package my.blog.lambda;

import java.util.List;

/**
 * @author zcf13543354971@163.com
 * @version 1.0
 * @date 2019/9/20
 */
@FunctionalInterface
public interface MyPre<E> {
     Integer run(E e);

}
