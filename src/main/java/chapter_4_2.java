public class chapter_4_2 {
    public static void main(String[] args) {
        Enemy mos = new Enemy("スライム");
        mos.attack();
    }

}

class Enemy {
    private String myname;
    public Enemy(String name) {
        myname = name;
    }
    public void attack() {
        System.out.println(myname + "は、勇者を攻撃した");
    }
}
