package Interfaces;

import java.util.UUID;

public interface PaymentGateway {

    //abstract method to process payment
    void processPayment(double amount) throws InsufficientBalanceException;

    default String generateTransactionId(String prefix){
        return prefix+"-"+UUID.randomUUID();
    }

    //default method for showing transactions
    // default void transactionSuccessful(String transactionId){
    //     System.out.println("Transaction successful. ID:"+transactionId);
    // }
     
    //static method for showing common instructions
    static void showInstructions(){
        System.out.println("Please follow PayementGateway instructions carefully");
    }

}
