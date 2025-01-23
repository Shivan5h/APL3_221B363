public class OverridingExample {
    public static void main(String[] args) {
        Mother m = new Mother();
        Child c = new Child();
        System.out.println("Output from Mother class: " + m.show());
        System.out.println("Output from Child class: " + c.show());
    }
}
