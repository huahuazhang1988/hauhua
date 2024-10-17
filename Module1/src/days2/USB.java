package days2;

public interface USB {
    void open();
    void close();
    //void close();
    public default void method1(){
        System.out.println("default method");
    }
    public static void method2(){
        System.out.println("static method");
    }
}
