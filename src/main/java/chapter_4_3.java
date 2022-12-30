import java.util.*;


public class chapter_4_3 {
    public static void main(String[] args) {
        ArrayList<Enemy> enemies = new ArrayList<Enemy>();//これらの事をコレクションという
        enemies.add(new Enemy("スライム"));
        enemies.add(new Enemy("モンスター"));
        enemies.add(new Enemy("ドラゴン"));

        for (Enemy member : enemies) {
            member.attack();
        }

    }

}

class enemy {
    private String myname;
    public enemy(String name) {
        myname = name;
    }
    public void attack() {
        System.out.println(myname + "は、勇者を攻撃した");
    }
}
