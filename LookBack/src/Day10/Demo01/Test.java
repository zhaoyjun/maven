package Day10.Demo01;

public class Test {
    @org.junit.Test
    public void playTest() {
        Interimpl i = new Interimpl();
        i.play();
    }


    @org.junit.Test
    public void playTest2() {
        Inter inter = new Inter() {
            @Override
            public void play() {

            }
        };

    }
}
