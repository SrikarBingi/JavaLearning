package Day9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPooling {
   public static void main(String[] args) {
       ExecutorService executor = Executors.newFixedThreadPool(3);

       for (int i = 0; i < 10; i++) {
           executor.execute(() -> {
               System.out.println(Thread.currentThread().getName() + " is executing a task");
           });
       }

       executor.shutdown();
   }
}
