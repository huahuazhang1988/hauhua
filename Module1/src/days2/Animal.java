package days2;

public  abstract class Animal {
    int age;

    public Animal(int age) {
        this.age = age;
    }

    public abstract void eat();
    public abstract  void drink();
}
