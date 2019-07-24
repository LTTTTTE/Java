package reflection.first;

import java.lang.reflect.Method;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        Class aClass = Class.forName("java.util.Collection");
        Class primitive = boolean.class;
        Class reference = Integer.TYPE;

        System.out.println(aClass.getTypeName());
        System.out.println(primitive.getTypeName());
        System.out.println(reference.getTypeName());
        System.out.println();
        System.out.println(aClass.getName());
        System.out.println(primitive.getName());
        System.out.println(reference.getName());
        System.out.println();
        System.out.println(aClass.getMethods().length);
        Stream<Method> methodStream = Stream.of(aClass.getMethods());
        String collect = methodStream.map(Method::getName).collect(Collectors.joining(","));
        System.out.println(collect);

    }
}
