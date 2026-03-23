package Day8;

public class ThreadFactory {
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo(1, 2);
        threadDemo.run();
    }
}
