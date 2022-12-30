public class chapter_6 {
    public static void main(String[] args) {
        String text = new String("hello world");
        System.out.println(text);
        System.out.println(text.length());

        int[] numbers = new int[4];
        for (int number : numbers) {
            System.out.print(number + ",");
        }
        System.out.println("");
        System.out.println(numbers.length);//配列のlengthは()が付いていない　これはメンバー変数のように扱う事ができる　ちょっと特殊ではある
    }

    //int doubleはオブジェクトではない　Stringはオブジェクトである
}
