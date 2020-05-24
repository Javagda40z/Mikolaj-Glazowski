package adnotacje;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<Testowa> klasa = Testowa.class;

        Testowa obiekt = Testowa.class.getConstructor().newInstance();
        obiekt.method();
        Method[] methods = klasa.getMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }

        Method method3 = klasa.getDeclaredMethod("methoda3", int.class);
        method3.invoke(obiekt, 50);

        Field field = klasa.getDeclaredField("zmienna");
        field.setAccessible(true);
        field.set(obiekt, "to jest zmienna ktora jest prywatna");
        obiekt.method();

        Method prywatnaMetoda = klasa.getDeclaredMethod("method2");
        prywatnaMetoda.setAccessible(true);
        prywatnaMetoda.invoke(obiekt);

    }
}
