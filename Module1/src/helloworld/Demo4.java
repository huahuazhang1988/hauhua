package helloworld;

import java.util.Random;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10);
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("please enter your guessnum: ");
            int guessnum = sc.nextInt();
            if(guessnum==num){
                System.out.println("conglatution,you are right");
                break;
            } else if (guessnum>num) {
                System.out.println("guessnum is too big");
            } else {
                System.out.println("guessnum is too small");
            }
        }
    }
}
