package days1;

public class Zi extends  Fu {
    int num=100;
    public void methodZi(){
        System.out.println("Zi");
    }

    @Override
    public void methodFu() {
        System.out.println(super.num);
        System.out.println("from methodfu");
    }
}
