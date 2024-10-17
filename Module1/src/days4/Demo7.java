package days4;

import java.util.Scanner;

public class Demo7 {
    static String[] name={"zhangsan","lisi"};
    public static void main(String[] args) throws RegisterException {


        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your name:");
        String names = sc.next();
        for (int i = 0; i <name.length ; i++) {
            if(names.equals(name[i])){
                throw new RegisterException("the username is already exist");
            }

        }
        System.out.println("congratulation");
    }
}
