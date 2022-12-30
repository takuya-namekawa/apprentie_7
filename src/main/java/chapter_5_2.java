public class chapter_5_2 {
    public static void main(String[] args) {
        //学生の国語と算数のテストの点数を保持するクラスで、テストの合計点数を計算するsum()メソッドを持っています。
        //
        //このクラスを使って、次の学生のオブジェクトを作成し、合計点数の計算結果を表示してください。
        //出力形式のXXXのところに、合計点数が入ります。
        //
        //国語 = 10点
        //算数 = 93点
        //
        //出力形式： 合計はXXX点です
        Gakusei gakusei = new Gakusei(10,93);
        System.out.println(gakusei.sum() + "点です");



    }
}


class Gakusei {
    private int mykokugo, mysansu;
    public Gakusei(int kokugo, int sansu) {
        mykokugo = kokugo;
        mysansu = sansu;
    }

    public int sum() {
        return mykokugo + mysansu;
    }
}
