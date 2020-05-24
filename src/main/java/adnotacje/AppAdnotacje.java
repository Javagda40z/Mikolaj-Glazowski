package adnotacje;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AppAdnotacje {
    @Dowolnosc
    public static void main(String[] args) {

        System.out.println(KlasaTestowa.class.getSimpleName());
        System.out.println(KlasaTestowa.class.getDeclaredAnnotations());

        for (Annotation declaredAnnotation :
                KlasaTestowa.class.getDeclaredAnnotations()) {
            System.out.println(declaredAnnotation.annotationType());

            Class<? extends Annotation> annotation = declaredAnnotation.annotationType();
            System.out.println(annotation);

            for (Method method : annotation.getMethods()) {
                System.out.println(method.getName());
            }
        }


    }
}
