package Day09.Demo01;

public class Son extends Father{
   public String name="儿子";
    public  int age=12;

    public  void show(){
        System.out.println("听话");
        super.age=22;
        super.show();
    }
}
