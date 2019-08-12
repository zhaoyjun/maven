package Day09.Demo01;


import org.junit.Test;


public class TestDemo {
    @Test
    public void test1(){
        Father f =new Father();
        f.show();
    }
    @Test
    public void test2(){
        Son s =new Son();
        System.out.println(s.age);

        s.show();
    }

}
