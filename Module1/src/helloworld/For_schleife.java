package helloworld;

public class For_schleife {
    public static void main(String[] args) {
        int i=0;
      do{
          System.out.println("i love java"+i);
          i++;
      }while (i<5);
    }
    public static void test1(){
        int i=5;
        while (i<10){
            System.out.println(i);
            i++;
        }
    }
    public static void test2(){
        double height=8844430;
        double sum=0.1;
        int count=0;
        while(true){
            if(sum>=height){
                break;
            }
            sum*=2;
            count++;

        }
        System.out.println(count);

    }
}
