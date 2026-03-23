package inheritance.hasA;

public class Student {
    String name;
    Address address;


   public void printAddress(){
       System.out.println(address.city);
   }

    //aggregation
    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }



    public void printPincode(){
        System.out.println(address.getPincode());
    }
}
