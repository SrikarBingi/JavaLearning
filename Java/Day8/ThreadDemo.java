package Day8;

public class ThreadDemo extends Thread {
    int a;
    int b;
    public ThreadDemo(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println(Thread.currentThread().getName());
        System.out.println(a+b);
    }

    
}
