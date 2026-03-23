package Day8;

public class TaskMain {
    public static void main(String[] args) {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.run();

        // ThreadDemo threadDemo2 = new ThreadDemo(2,3);
        // threadDemo2.start();
        
        Thread thread2 = new Thread(task);
        thread2.start();

        for(int i=0;i<10;i++){
            Thread currentThread = new Thread(task);
            currentThread.start();
        }
    }
}
