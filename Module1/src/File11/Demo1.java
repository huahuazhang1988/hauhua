package File11;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        System.out.println(File.pathSeparator);
        System.out.println(File.separator);
        File f1= new File("C:\\Users\\huahu\\Desktop\\zeitfracht\\"+"abc.txt");
        System.out.println(f1);
        System.out.println(f1.getName());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getPath());
        System.out.println(f1.length());
        System.out.println("=============");
        File f2= new File("C:\\Users\\huahu\\Desktop\\fotos\\me.jpg");
        System.out.println(f2.length());
        System.out.println(f2.getParentFile());
        System.out.println(f1.exists());
        System.out.println(f2.exists());
        System.out.println(f2.isDirectory());
        System.out.println(f1.isDirectory());
        findFile( new File("C:\\Users\\huahu\\Desktop\\zeitfracht"));
    }
    public static void test1() throws IOException {
        File file = new File("C:\\Users\\huahu\\Desktop\\zeitfracht\\"+"abc.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        file.delete();
    }
    public static void test2(){
        File file = new File("C:\\Users\\huahu\\Desktop\\zeitfracht\\aaa");
        file.mkdir();
        File file1= new File("C:\\Users\\huahu\\Desktop\\zeitfracht\\bbb\\ccc\\ddd");
        file1.mkdirs();
    }
    public static void test3(){
        File file= new File("C:\\Users\\huahu\\Desktop\\zeitfracht");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("===============");
       File[] file1= file.listFiles();
        for (File file2 : file1) {

            System.out.println(file2.getName());
        }
    }
    public static void findFile(File dir){
        File[] files = dir.listFiles();
        for (File file : files) {
            if(file.isDirectory()){
                findFile(file);
            }else {
                System.out.println(file.getName());
            }

        }
    }
    public static void findFile1(File dir){
        File file=new File("C:\\Users\\huahu\\Desktop\\zeitfracht");
        file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return false;
            }
        });

    }
}
