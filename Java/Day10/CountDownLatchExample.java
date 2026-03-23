

public class CountDownLatchExample {
    public CountDownLatchExample(int i) {
            //TODO Auto-generated constructor stub
        }
    
        public static void main(String[] args) throws InterruptedException {
            CountDownLatchExample latch = new CountDownLatchExample(3);

        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " finished");
            latch.countDown();
                    };
            
                    new Thread(task).start();
                    new Thread(task).start();
                    new Thread(task).start();
            
                    latch.wait();
                    System.out.println("All threads finished");
                    System.out.println("Hey");
                }
            
                    private void countDown() {
                        // TODO Auto-generated method stub
                        throw new UnsupportedOperationException("Unimplemented method 'countDown'");
                    }
}
