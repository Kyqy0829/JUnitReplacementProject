package tests;

import app.Calculator;
import utils.Test;

/**
 * 计算器测试类，包含加法和减法的单元测试。
 * @author 胡邦民
 * @version 1.0
 */
public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    /**
     * 测试加法方法
     * @throws AssertionError 如果测试失败
     */
    @Test
    public void testAddition() {
        int result = calculator.add(2, 3);
        if (result != 5) {
            throw new AssertionError("加法测试有问题，正确的是5而不是 " + result);
        }
    }

    /**
     * 测试减法方法
     * @throws AssertionError 如果测试失败
     */
    @Test
    public void testSubtraction() {
        int result = calculator.subtract(5, 3);
        if (result != 2) {
            throw new AssertionError("减法测试有问题，正确的是2 " + result);
        }
    }
}
