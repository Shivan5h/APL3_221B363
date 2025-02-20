abstract class Duck {
    SwimBehavior swimBehavior;
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(SwimBehavior swim, FlyBehavior fly, QuackBehavior quack) {
        this.swimBehavior = swim;
        this.flyBehavior = fly;
        this.quackBehavior = quack;
    }

    void performSwim() {
        swimBehavior.swim();
    }

    void performFly() {
        flyBehavior.fly();
    }

    void performQuack() {
        quackBehavior.quack();
    }
}