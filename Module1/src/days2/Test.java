package days2;

public class Test {
    final int num=10;
    public static void main(String[] args) {
     /*   Dog dog = new Dog(12);
        method1(dog);
        Animal animal= new Cat(10);
        animal.drink();

        if(animal instanceof Cat){
            Cat cat=(Cat)animal;
        }*/
        Test3 test = new Test3();
        Test3 test2 = new Test3();


    }
    public static void method1(Animal animal){
        animal.drink();
        animal.eat();
    }
}
