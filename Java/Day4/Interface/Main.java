package Day4.Interface;

public class Main {
    public static void main(String[] args) {
        // InterfaceImpl obj = new InterfaceImpl();
        // obj.add(2,3);

        // InterfaceTest interfaceTest = new InterfaceTest();
        // interfaceTest.add();
        // interfaceTest.multiply();
        // interfaceTest.subtract();
        //         // System.out.println(a);
        SchoolStudent s = new SchoolStudent();
        CollegeStudent c = new CollegeStudent();

        University1 u1 = new University1(s);

        University1 u = new University1(c);

        // gets error as we used CollegeStudent in university2 constructor
        // University2 u2 = new University2(s); 
        System.out.println(u);
        System.out.println(u1);
    }
}
