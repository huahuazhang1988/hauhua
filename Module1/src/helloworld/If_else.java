package helloworld;

import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 10;
        int num2 = 12;
        if (num == num2) {
            System.out.println("num==num2");
        } else if (num > num2) {
            System.out.println("num>num2");
        } else {
            System.out.println("num<num2");
        }
    }
}
