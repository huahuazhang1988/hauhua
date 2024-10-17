package days4;

import java.util.List;

public class Demo6 {
    public static void main(String[] args) {
        try{
            int[] arr={1,2,3};
            List<Integer> list = List.of(4, 5, 6);
            int num=arr[3];
            list.get(4);
        }catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println(e);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
