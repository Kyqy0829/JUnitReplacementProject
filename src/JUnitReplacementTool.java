import java.util.List;
import utils.ClassScanner;
import utils.TestRunner;


 // JUnit 替代工具，自动扫描并运行所有测试类
 
public class JUnitReplacementTool {
    public static void main(String[] args) {
        try {
            List<Class<?>> testClasses = ClassScanner.getClasses("tests");
            for (Class<?> testClass : testClasses) {
                TestRunner.runTests(testClass);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
