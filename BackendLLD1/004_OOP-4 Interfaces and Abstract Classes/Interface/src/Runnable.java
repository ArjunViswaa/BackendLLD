public interface Runnable {
    // Any data member in interface is public static and final
    // so it's basically a constant
    int x = 5;
    void run();

    default void walk() {
        System.out.print("New function added -> Walking");
    }

    // for utility purposes
    static void doSomething() {
        System.out.println("Static method can be written -> Do something");
    }
}
