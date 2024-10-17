package days1;

import helloworld.Person;

public class Test {
    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.num);
        fu.methodFu();
        Zi zi = new Zi();
        zi.methodFu();
        zi.methodZi();

    }
    public static void sum(int...arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
    public static void concat(String...names){
        String result="";
        for (int i = 0; i < names.length; i++) {
            result+=names[i];
        }
        System.out.println(result);
    }
}
