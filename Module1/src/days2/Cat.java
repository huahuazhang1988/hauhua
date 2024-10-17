package days2;

public class Cat extends Animal{
    public Cat(int age) {
        super(age);
    }
    public void catchmouse(){
        System.out.println("cat catch mouse");
    }

    @Override
    public void eat() {
        System.out.println("cat drinks water");
    }

    @Override
    public void drink() {
        System.out.println("cat drinks water");
    }
}
