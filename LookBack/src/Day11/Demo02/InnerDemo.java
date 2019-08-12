package Day11.Demo02;

public class InnerDemo {
    public static void main(String[] args) {

    new  FlyAble() {

        @Override
        public void fly() {
            System.out.println("i");
        }
    };
    }
}
