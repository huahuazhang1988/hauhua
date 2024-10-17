package helloworld;

import java.util.Scanner;

public class Demo3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter your score: ");
        int num = sc.nextInt(4);
        switch (num){
            case 1:
                System.out.println("1111");
                break;
            case 2:
                System.out.println("2222");
                break;
            case 3:
                System.out.println("3333");
                break;
            default:
                System.out.println("else");
                break;

        }
    }
}
