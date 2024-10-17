package functionalinterface;

import java.util.function.Predicate;

public class Demo4 {
    public static void main(String[] args) {
        boolean result= checkString("huahua",(String name)->{return name.length()>2;},
                (String name)->{ return name.startsWith("h");});
        System.out.println(result);
    }
    public static boolean checkString(String s, Predicate<String> pre1,Predicate<String> pre2){
        return pre1.or(pre2).test(s);
    }
}
