package days3;

public class Test <I> implements GeneralInterface<I>{
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
