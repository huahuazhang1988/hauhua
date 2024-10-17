package days10;

import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {
        System.out.println(test1(5));
        int[] ints = test2(new int[]{1, 3, 5, 6}, 12);
        System.out.println(Arrays.toString(ints));

    }
    public static int test1(int n){
        if(n==1){
            return 1;
        } else if (n==2) {
            return 2;

        }
        int result=0;
        int pre=2;
       int  prepre=1;
        for (int i = 3; i <=n; i++) {
            result=pre+prepre;
            prepre=pre;
            pre=result;
        }
        return result;

    }
    public static int[] test2(int[] arr,int target){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }}}
        return null;
    }
}
