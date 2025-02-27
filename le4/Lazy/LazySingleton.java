class LazySingleton {
	private static LazySingleton instance;

	private LazySingleton() {} // Private constructor

	public static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
        
	}
    public static void main(String[] args) {
        LazySingleton singleton = LazySingleton.getInstance();
    }
}
