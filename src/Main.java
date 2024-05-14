import java.lang.classfile.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        CAT cat = new CAT("sajjad", 23);
        Class clc = null;
        clc = Class.forName("CAT");
        Method[] methods = clc.getDeclaredMethods();
        for(Method method : methods){
            if (method.isAnnotationPresent(Important.class)) {
                Important annotation = method.getAnnotation(Important.class);
                System.out.println(annotation.count());
                method.invoke(cat);
            }
        }
    }
}