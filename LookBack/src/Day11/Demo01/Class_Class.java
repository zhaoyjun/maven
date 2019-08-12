package Day11.Demo01;

public class Class_Class {
    private  String name;

    public Class_Class() {
    }

    public Class_Class(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("外");
    }

    class  User{
         private  String address ;

         public User(String address) {
             this.address = address;
         }
         public void show(){
             System.out.println("nei");
         }
     }

}
