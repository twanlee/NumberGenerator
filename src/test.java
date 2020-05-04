public class test {
    public static void main(String[] args) {
        NumberGenerator numberGenerator1 = new NumberGenerator("A");
        NumberGenerator numberGenerator2 = new NumberGenerator("B");
        Thread a = new Thread(numberGenerator1);
        Thread b = new Thread(numberGenerator2);
        a.start();
        b.start();
    }
}
