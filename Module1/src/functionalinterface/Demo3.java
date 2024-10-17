package functionalinterface;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Demo3 {
    public static void acceptString(String name, Consumer<String> com){
        com.accept(name);
    }
    public static String getString(Supplier<String> sub){
        return sub.get();
    }
    public static void main(String[] args) {
      // String name= getString(()->{return "huahua";});
        //System.out.println(name);
        acceptString("hauhua",(String name)->{
            System.out.println(name);
        });
    }
}
