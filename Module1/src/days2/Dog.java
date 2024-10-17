package days2;

public class Dog extends Animal{
    public Dog(int age) {
        super(age);
    }
    public void lookdoor(){
        System.out.println("dog look door");
    }

    @Override
    public void eat() {
        System.out.println("dog eat");
    }

    @Override
    public void drink() {
        System.out.println("dog drinks water");
    }
}
