package functionalinterface;

import java.util.function.Function;

public class Demo5 {
    public static void main(String[] args) {
        change("10",(String num)->{
            Integer i = Integer.valueOf(num);
            return i;
        }   );
        change1("20",(String num)->{
         return Integer.parseInt(num)   ;
        }, (Integer i)->{
            return i+20;
                });

    }
    public static void change(String num, Function<String,Integer> fun){
        Integer result = fun.apply(num);
        System.out.println(result);
    }
    public static void change1(String num,Function<String,Integer> fun,Function<Integer,Integer> fun1){
        Integer num1 = fun.andThen(fun1).apply(num);
        System.out.println(num1);
    }
}
