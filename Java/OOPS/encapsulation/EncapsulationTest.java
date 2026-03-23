public class EncapsulationTest
{    
    public static void main (String[] args) 
    {
        Encapsulation obj = new Encapsulation();
        
        // setting values of the variables 
        obj.setName("Harsh");
        obj.setAge(19);
        obj.setRoll(51);
        
        // Displaying values of the variables
        System.out.println("Student's name: " + obj.getName());
        System.out.println("Student's age: " + obj.getAge());
        System.out.println("Student's roll: " + obj.getRoll());
        
        // Direct access of geekRoll is not possible
        // due to encapsulation
        // System.out.println("Geek's roll: " + obj.geekName);        
    }
}