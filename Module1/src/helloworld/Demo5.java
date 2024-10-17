package helloworld;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
    /*    int[] arr1={1,2,3,12,13,32,21,10};
        System.out.println(arr1.length);

        int[] arr2= new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <3 ; i++) {
            System.out.println("please enter the"+ i+ "  number");
            arr2[i]=sc.nextInt(10);

        }
        System.out.println(Arrays.toString(arr2));*/
        test3();
    }
    public static void test1(){
        int[] arr1={1,2,3,12,13,32,21,10};
        int max=arr1[0];
        for (int i = 0; i <arr1.length ; i++) {
            if(arr1[i]>max){
                max=arr1[i];
            }
        }
        System.out.println(max);

    }
    public static void test2(){
        Random random = new Random();
        int count=0;
        for (int i = 0; i <10 ; i++) {
            int num = random.nextInt(101);
            if(num%3==0&&num%5==0 && num%7!=0){
                count++;
                System.out.println(num);
            }
        }

    }
    public static void test3(){
        int[] arr1={1,2,3,12,13,32,21,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your number");
        int data = sc.nextInt();
        for (int i = 0; i < arr1.length ; i++) {
            if(data==arr1[i]){
                System.out.println(i);
            }

        }

    }
}
