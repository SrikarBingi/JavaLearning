package Interfaces;

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}

class CreditCardPayment implements PaymentGateway{

    private double balance;

    public CreditCardPayment(double balance){
        this.balance = balance;
    }

    @Override
    public void processPayment(double amount) throws InsufficientBalanceException{
        if(amount<=0){
            throw new IllegalArgumentException("Amount must be greater than zero.");
        }
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient balance. Available balance: rs"+balance);
        }
        balance -= amount;
        String transactionId = generateTransactionId("CreditCard");
        System.out.println("Transaction successful. ID:"+transactionId);
        System.out.println("Available balance: rs"+balance);
    }
    public double getBalance(){
        return balance;
    }
}

public class PaymentGatewayApp {
    public static void main(String[] args) {

        PaymentGateway.showInstructions();

        CreditCardPayment cc = new CreditCardPayment(1000.00);

        try{
            System.out.println("Initial balance: rs"+cc.getBalance());
            cc.processPayment(500.00);
            cc.processPayment(-200.00);
            cc.processPayment(1500.00);
        }
        catch(InsufficientBalanceException e){
            System.out.println("Error: "+e.getMessage());
        }
        catch(IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
