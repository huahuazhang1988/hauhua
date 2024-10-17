package helloworld;

import java.util.Random;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
       // System.out.println("please enter your score: ");
       // int num = sc.nextInt();
       // System.out.println("your score is "+num);
       // System.out.println("please enter your name: ");
       // String name = sc.next();
       // System.out.println("your name  is :" +name);
        Random random = new Random();
        int num = random.nextInt(10) + 1;
        System.out.println(num);


    }
}
