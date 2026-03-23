package Day8;

import java.util.ArrayList;
import java.util.List;

public class FactorialDemo {
    public static void main(String[] args) {
        List<Integer > list = List.of(1,2,3,4,5,6,7,8,9,10);

        // for(int i=0;i<list.size();i++){
        //     System.out.println(Factorial.factorial(list.get(i)));
        // }

        //Using streams

        Long start = System.currentTimeMillis();
        list.stream().forEach(
            (i)->{
                System.out.println(Factorial.factorial(i));
            }
        );
        Long end = System.currentTimeMillis();
        System.out.println("////////////////////");
        System.out.println(end-start);

        System.out.println("////////////////////");

        List<Thread> threads = new ArrayList<>();

        start = System.currentTimeMillis();

        list.stream().forEach(
            (i)->{
                
                    // try {
                        Thread thread = new Thread(new FactRunnable(i));
                        thread.start();
                        threads.add(thread);
                        //wait for completion of this thread
                        // thread.join();
                        //process the response
                    // } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        // e.printStackTrace();
                    // }
                
            }
        );

        end = System.currentTimeMillis();
        System.out.println(end-start+"/");
    }
}
