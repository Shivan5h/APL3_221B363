public class Main {
    public static void main(String[] args) {
        IndianCrow crow = new IndianCrow();
        Swann swannDisguisedCrow = new CrowAdapter(crow);
        Princess princess = new Princess();
        princess.organizeDate(swannDisguisedCrow);
    }
}
