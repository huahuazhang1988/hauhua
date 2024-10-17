package days4;

import java.io.FileNotFoundException;
import java.util.Objects;

public class Demo5 {
    public static void main(String[] args) {
       readFile1("adf.txt");
        
    }
    public static int getElement(int[] arr,int index){
        if(arr==null){
           // throw  new NullPointerException("null");
            throw  new RuntimeException(" is null");
        }
        return arr[index];
    }
    public static int method1(int[] arr,int index){
        Objects.requireNonNull(arr);
        return arr[index];
    }
    public static void readFile(String path) throws FileNotFoundException {
        if(!path.equals("abx.txt")){
            throw new FileNotFoundException("not exist");
        }
    }
    public static void readFile1(String path) {
        if(!path.equals("abc.txt")){

            try {
                throw new FileNotFoundException("not exist");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
              //  e.printStackTrace();
              //  System.out.println(e.getMessage());
            } finally {
                System.out.println("finally");
            }

        }
        System.out.println("huahua");
    }
}
