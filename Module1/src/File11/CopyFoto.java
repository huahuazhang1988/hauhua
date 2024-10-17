package File11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFoto {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\huahu\\Desktop\\fotos\\newFotos.jpg");
        FileInputStream ins= new FileInputStream("C:\\Users\\huahu\\Desktop\\fotos\\me.jpg");
        byte[] bytes= new byte[1024];
        int len=0;
        while ((len=ins.read(bytes))!=-1){
            fos.write(bytes);
        }
        fos.close();
        ins.close();
    }
}
