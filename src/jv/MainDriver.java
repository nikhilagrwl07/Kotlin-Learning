package jv;

import static kt.extension.FunctionExtensionsUtilKt.repeat;
import static kt.function.FunctionsKt.topLevel;
import static kt.extension.FunctionExtensionsUtilKt.lastChar;

public class MainDriver {
    public static void main(String[] args) {
        Person person = new Person("Nikhil", 26);
        System.out.println(person.getName());

        // toplevel function in kt is called as static method in java
        System.out.println(topLevel());


        char c = lastChar("abc");
        System.out.println(c);

        // first argument is receiver of function extension. String in this case
        // second argument is explicitly defined argument
        String repeatedStringNtimes = repeat("abc", 3);

        System.out.println(repeatedStringNtimes);

        Integer a =100;
        Integer b =100;

        if(a==b)
            System.out.println("checking a==b");


        Integer d =130;
        Integer e =130;

        if(d==e)
            System.out.println("checking d==e");
    }
}
