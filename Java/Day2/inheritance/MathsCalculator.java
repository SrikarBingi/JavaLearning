package inheritance;

public class MathsCalculator extends Calculator {
   public int add(int a,int b,int c){
    System.out.println("Maths Calculator");
       return a+b+c;
   }
    //a=56
  int a =20;

    public MathsCalculator(int a) {
        // super(a+1);
        this();
        this.a = a;

        //this if for hashCode
       System.out.println(a);

    }

    public MathsCalculator(){
       System.out.println("Inside Maths Calculator");
    }

    public void printA(){
        // System.out.println(super.a);
        super.printA();
    }
}
