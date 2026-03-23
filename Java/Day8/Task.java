package Day8;

public class Task implements Runnable{

    //If a class implements Runnable that means
    //it is a task that can be executed by a thread

    /**
    //using runnable:
    1. Create a class that implements runnable
    2. provide the task inside the run method of that class
    3. Create an instance of that class
    4. Create object of Thread class with above object
    5. Start the start
    **/

    @Override
    public void run() {
        // TODO Auto-generated method stub
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
