package utils;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 自定义 @Test 注解，用于标记测试方法
 * @author 胡邦民
 * @version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
}
