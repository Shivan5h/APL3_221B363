class LakeDuck extends Duck {
    public LakeDuck() {
        super(new CanSwim(), new CanFly(), new Quack());
    }
}
