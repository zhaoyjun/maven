package Day09.Demo02;

public abstract class Abs {
    String name;

    public Abs(String name) {
        this.name = name;
    }

    public abstract void play();

    public String fun() {
        return "玩的开心";
    }
}
