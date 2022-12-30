public class chapter_5 {
    public static void main(String[] args) {
        Item apple = new Item(120,15);
        System.out.println("合計金額は" + apple.getTotalAmount() + "円です");
        Item total = new Item(50,50);
        System.out.println(total.getTotalAmount());


    }
}

class Item {
    private int price, quantity;
    public Item(int Price, int Quantity) {
        price = Price;
        quantity = Quantity;
    }

    public int getTotalAmount() {
        return price * quantity;
    }

}
