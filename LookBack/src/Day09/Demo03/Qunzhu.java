package Day09.Demo03;

public class Qunzhu extends User {
    public Qunzhu() {
    }

    public Qunzhu(String name, int money) {
        super(name, money);
    }
    //发送出去多少钱
    public  void send(int sendMoney,int count){
                   int money=getMoney();
                   money = money - sendMoney;
    }

}
