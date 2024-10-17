package days1;

import java.util.Arrays;


public class Demo1 {
    public static void main(String[] args) {
       int[] arr={20,32,12,3,15,54,8};
        extracted(arr);

        System.out.println(Arrays.toString(arr));
        method4();

    }

    private static void extracted(int[] arr) {
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]> arr[j]){
                    int temp= arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    private static void method4() {
    }

    public static void method1(int n){
        System.out.println(n);
        if(n==1){
            return;
        }

        n--;
        method1(n);
    }
    public static int method2(int n){
        if(n==1){
            return 1 ;
        }
        return n*method2(n-1);
    }
    public static int method3(int n){

         if(n==1 || n==2){
             return 1;
         }
         return method3(n-1)+method3(n-2);
    }
}
