public class LE3_3
{
	public static void main(String[] args) {
        Duck rd = new RubberDuck();
        Duck wd = new WoodenDuck();
        Duck rhd = new RedHeadDuck();
        Duck ld = new LakeDuck();

        System.out.println("Rubber Duck:");
        rd.performSwim();
        rd.performFly();
        rd.performQuack();

        System.out.println("\nWooden Duck:");
        wd.performSwim();
        wd.performFly();
        wd.performQuack();

        System.out.println("\nRedHead Duck:");
        rhd.performSwim();
        rhd.performFly();
        rhd.performQuack();

        System.out.println("\nLake Duck:");
        ld.performSwim();
        ld.performFly();
        ld.performQuack();
    }
}











