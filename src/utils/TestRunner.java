package utils;

import java.lang.reflect.Method;

/**
 * 运行测试方法的工具类
 * @author 胡邦民
 * @version 1.0
 */
public class TestRunner {

    /**
     * 运行指定测试类中的所有测试方法
     * @param testClass 要运行的测试类
     */
    public static void runTests(Class<?> testClass) {
        System.out.println("Running tests in class: " + testClass.getName());
        for (Method method : testClass.getDeclaredMethods()) {
            // 判断方法是否有 @Test 注解，或以 "test" 开头
            if (method.isAnnotationPresent(Test.class) || method.getName().startsWith("test")) {
                try {
                    Object instance = testClass.getDeclaredConstructor().newInstance();
                    method.invoke(instance);
                    System.out.println("[PASS] " + method.getName());
                } catch (Exception e) {
                    System.out.println("[FAIL] " + method.getName() + " - " + e.getCause());
                }
            }
        }
    }
}
