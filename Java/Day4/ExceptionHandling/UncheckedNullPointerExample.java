package Day4.ExceptionHandling;

public class UncheckedNullPointerExample {
    public static void main(String[] args) {
        String user = null;
        try{
            System.out.println(user.length());
        }
        catch(NullPointerException e){
            System.out.println("User details are missing:");
        }
    }
}
