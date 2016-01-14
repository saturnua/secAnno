import java.lang.reflect.*;
import java.lang.annotation.*;

public class Main {

	public static void main(String[] args) {
		AnnotationTest anno = new AnnotationTest();
		anno.test();
		anno.doWork();
		anno.printResult();
		System.out.println("-----------------------------------------------------------------------");
		
		Class myClass = anno.getClass();
		Method[] allMethods = myClass.getDeclaredMethods();
        for (Method m : allMethods) {
            // получаем аннотации
            Annotation[] annotations = m.getAnnotations();
            System.out.print("\t");
           
            for (Annotation a : annotations)
                System.out.print("@" + a.annotationType().getSimpleName() + "");
                System.out.println();

	           System.out.print("\t" + Modifier.toString(m.getModifiers())+ " " + getType(m.getReturnType()) + " " + m.getName()+ "()");
	          // System.out.print(getParameters(m.getParameterTypes()));
              // System.out.println(") { }");
           
        }
    }

	private static char[] getParameters(Class<?>[] parameterTypes) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String getType(Class<?> returnType) {
		// TODO Auto-generated method stub
		return null;
	}

}
