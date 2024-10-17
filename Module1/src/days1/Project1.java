package days1;

import java.util.ArrayList;
import java.util.Scanner;

public class Project1 {
    private static ArrayList<Student> list = new ArrayList<>();
    public static void main(String[] args) {

        boolean flag=true;

        while(flag){
            System.out.println("---------学生管理系统-----------------");
            System.out.println("1 添加学生          1 添加学生");
            System.out.println("2 修改学生          2 修改学生");
            System.out.println("3 删除学生          3 删除学生");
            System.out.println("4 查看学生          4 查看学生");
            System.out.println("5 推   出          5 推   出 ");
            Scanner sc = new Scanner(System.in);
            System.out.println("please choose 1-5:");
            int num = sc.nextInt();
            switch (num){
                case 1:
                    add();
                    break;
                case 2:
                    update();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    view();
                    break;
                case 5:
                    System.out.println("programm exit");
                    flag=false;
                    break;
            }

        }

    }
    public static void add(){
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter the student id:");
        int id = sc.nextInt();
        System.out.println("please enter the student name:");
        String name = sc.next();
        System.out.println("please enter the student age:");
        int age=sc.nextInt();
        System.out.println("please enter the student gender:");
        String gender=sc.next();
        Student student = new Student(id, name, age, gender);
        list.add(student);
        System.out.println("add successfully");

    }
    public static void update(){
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter the student id:");
        int id = sc.nextInt();
       // if()

        System.out.println("please enter the student name:");
        String name = sc.next();
        System.out.println("please enter the student age:");
        int age=sc.nextInt();
        System.out.println("please enter the student gender:");
        String gender=sc.next();
        Student student = new Student(id, name, age, gender);
        list.add(student);
        System.out.println("add successfully");

    }
    public static void delete(){
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter the student id:");
        int id = sc.nextInt();
        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i).getId()==id){
                list.remove(list.get(i));
            }
        }
        System.out.println("delete successfully");
    }
    public static void view(){
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
