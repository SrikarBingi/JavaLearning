package Day8;

public class FactRunnable implements Runnable{

    int x;

    public FactRunnable(int x) {
        this.x = x;
    }



    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println(Thread.currentThread().getName() + " starts");
        try {
            Thread.sleep(100);
            System.out.println(Factorial.factorial(x));
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " end");
    }

}
