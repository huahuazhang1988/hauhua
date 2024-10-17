package days3;

import java.util.Arrays;

public class Stringutils {
    public static void main(String[] args) {
        String a1="hello";
        String a2="hello";
        String a3= new String("hello");
        System.out.println(a2==a1);
        System.out.println(a2==a3);
        char[] charArray = "hello".toCharArray();
        byte[] bytes = "hello".getBytes();
        System.out.println(Arrays.toString(bytes));
        System.out.println(Arrays.toString(charArray));
        char[] arr={'A','B','C'};
        String a4= new String(arr);
        System.out.println(a4);
        byte[] arr1={102,100,105,21,18};
        System.out.println(new String(arr1));
    }
}
