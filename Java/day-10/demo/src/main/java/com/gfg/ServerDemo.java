package com.gfg;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ServerDemo {
    public static void main(String[] args) throws InterruptedException {
        
        Scanner sc = new Scanner(System.in);

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        while(true){
            System.out.println("Enter some input");
            String currInput = sc.nextLine();
            if(currInput.equalsIgnoreCase("exit")){
                break;
            }
            else{
                //main will not wait for this thread to execute
                executorService.submit(new Runnable() {
                    @Override
                    public void run(){
                        System.out.println(Thread.currentThread().getName()+" "+currInput);
                    }
                });
                //main thread will wait for executor service to finish its task
                executorService.awaitTermination(1000, TimeUnit.SECONDS);
            }
        }
    }
}
