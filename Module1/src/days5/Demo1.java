package days5;

public class Demo1 {
    public static void printdata(String s,Printable p){
        p.print(s);
    }
    public static void main(String[] args) {
        printdata("huahua",(String name)->{
            ObjectRer objectRer = new ObjectRer();
            objectRer.printString(name);
        });
        ObjectRer objectRer = new ObjectRer();
        printdata("hello",objectRer::printString);

    }
}
