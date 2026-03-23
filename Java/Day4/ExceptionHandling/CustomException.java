package Day4.ExceptionHandling;

class InvalidLoginDetailsException extends Exception{
    public InvalidLoginDetailsException(String message){
        super(message);
    }
}
public class CustomException {
    public static void checkPassword(String password) throws InvalidLoginDetailsException{
        if(!password.equals("1234")){
            throw new InvalidLoginDetailsException("Incorrect password!");
        }
        else{
            System.out.println("Correct Password");
        }
    }
    public static void main(String[] args) {
        try{
            checkPassword("123");
        }
        catch(InvalidLoginDetailsException e){
            System.out.println("Caught Exception:"+e.getMessage());
        }
        System.out.println("Execution finished");
    }
}
