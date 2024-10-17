package days4;

import java.util.HashMap;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your word");
        String str = sc.next();

        for (int i = 0; i <str.length() ; i++) {
            if(map.containsKey(str.charAt(i))){
                int value=map.get(str.charAt(i));
                value++;
                map.put(str.charAt(i),value);
            }else {
                map.put(str.charAt(i),1);
            }
        }
        System.out.println(map);
    }
}
