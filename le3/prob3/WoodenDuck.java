class WoodenDuck extends Duck {
    public WoodenDuck() {
        super(new CanSwim(), new CannotFly(), new Mute());
    }
}