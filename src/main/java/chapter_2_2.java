public class chapter_2_2 {
    public static void main(String[] args) {
        //Greetingクラスに、メッセージを表示するsayHelloメソッドが定義しなさい。
        //このクラスを実体化して、sayHelloメソッドを呼び出し、メッセージを表示しなさい。
        Greeting greeting = new Greeting();
        greeting.sayHello();

    }
}

class Greeting {
    public void sayHello() {
        System.out.println("Hello World");
    }
}
