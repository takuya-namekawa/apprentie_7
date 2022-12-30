public class chapter_3 {
    public static void main(String[] args) {
        Play player1 = new Play("勇者");
        player1.walk();
        Play player2 = new Play("マリア");
        player2.walk();
        //これらは命令を受けるオブジェクトとして名前はレシーバーという
    }
}

class Play {
    private String myname;//メンバー変数

    public Play(String name){//コンストラクタ
        myname = name;
    }
    public void walk() {
        System.out.println(myname + "は荒野を歩いていた");
    }
}
