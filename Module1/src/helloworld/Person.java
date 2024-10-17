package helloworld;

public class Person {
   private String name;
    private int age;
   private String school;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                '}';
    }

    public Person() {
    }

    public Person(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public String getName(){
       return name;
   }
   public void setName(String name){
       this.name=name;
   }

    public void eat(){
        System.out.println("people eating");
    }
    public void sleep(){
        System.out.println("people sleeping");
    }
}
