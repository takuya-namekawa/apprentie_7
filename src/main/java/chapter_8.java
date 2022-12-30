public class chapter_8 {
    public static void main(String[] args) {
        int total = Ite.getTotalAmout(100,1);
        System.out.println(total);
    }
}

class Ite {
   // private int pri, int quan;
    private static double tax = 1.08;

    //staticを使用する事で事前にオブジェクトを定義しなくても、その構文の中で、定義すれば、良くなる
    public static int getTotalAmout(int pri, int quan) {
        return (int)(pri * quan * tax);
    }

}