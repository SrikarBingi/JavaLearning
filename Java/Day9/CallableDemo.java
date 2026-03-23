package Day9;

import java.util.concurrent.Callable;

public class CallableDemo implements Callable<String> {
    @Override
    public String call() throws Exception {
       //thread.start();
        //executor.submit();
        Thread.sleep(1000);
        Thread.currentThread().join();
        System.out.println("call is called");
        return  "Returned by callable";
    }
}
