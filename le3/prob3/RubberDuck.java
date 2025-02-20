class RubberDuck extends Duck {
    public RubberDuck() {
        super(new CanSwim(), new CannotFly(), new Squeak());
    }
}