public interface RunnerPlus {

    public void run();

    default void walk() {
        System.out.print("New function added -> Interface RunnerPlus Walking");
    }
}
