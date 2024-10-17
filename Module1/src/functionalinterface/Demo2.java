package functionalinterface;

import java.util.Arrays;
import java.util.Comparator;

public class Demo2 {
    public static void startThread(Runnable run){
        new Thread(run).start();
    }
    public static void main(String[] args) {
      //  startThread(()-> System.out.println("thread is starting"));
        Comparator<String> com1 = getCom1();
        String[] arr={"abc","hello","a","huahua"};
        Arrays.sort(arr,com1);
        System.out.println(Arrays.toString(arr));
    }
    public static Comparator<String> getCom(){
        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();}};}
    public static Comparator<String> getCom1(){
        return (String o1, String o2)-> o1.length()-o2.length();
    }
}
