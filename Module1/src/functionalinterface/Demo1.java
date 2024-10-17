package functionalinterface;

public class Demo1 {
    public static void show(MyInterface myinter){
        myinter.method1();
    }
    public static void main(String[] args) {
        show(new MyInterface() {
            @Override
            public void method1() {
                System.out.println("hehe");
            }
        });
        show(()->
            System.out.println("functional interface")
        );

    }
}
