package utils;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * 该工具类用于扫描指定包中的所有类
 * @author 胡邦民
 * @version 1.0
 */
public class ClassScanner {

    /**
     * 扫描指定包下的所有类
     * @param packageName 包名，例如 "tests"
     * @return 包含该包下所有类的列表
     * @throws Exception 如果类加载失败
     */
    public static List<Class<?>> getClasses(String packageName) throws Exception {
        List<Class<?>> classes = new ArrayList<>();
        String path = packageName.replace('.', '/');
        URL url = Thread.currentThread().getContextClassLoader().getResource(path);
        if (url != null) {
            File directory = new File(url.toURI());
            for (File file : directory.listFiles()) {
                if (file.getName().endsWith(".class")) {
                    String className = packageName + "." + file.getName().replace(".class", "");
                    classes.add(Class.forName(className));
                }
            }
        }
        return classes;
    }
}
