package Day11.Demo01;

import Day09.Demo03.User;

public class Test {

    @org.junit.Test
    public void showTest(){
        Class_Class c =new Class_Class("哪的");
        c.show();
    }


    @org.junit.Test
    public void showTest2(){
        Class_Class.User c =new Class_Class().new User("ad");
        c.show();
    }
}
