package jv;

import static kt.FunctionExtensionsUtilKt.repeat;
import static kt.FunctionsKt.topLevel;
import static kt.FunctionExtensionsUtilKt.lastChar;

public class MainDriver {
    public static void main(String[] args) {
        Person person = new Person("Nikhil", 26);
        System.out.println(person.getName());

        // toplevel functions in kt is called as static method in java
        System.out.println(topLevel());


        char c = lastChar("abc");
        System.out.println(c);

        // first argument is receiver of function extension. String in this case
        // second argument is explicitly defined argument
        String repeatedStringNtimes = repeat("abc", 3);

        System.out.println(repeatedStringNtimes);
    }
}
