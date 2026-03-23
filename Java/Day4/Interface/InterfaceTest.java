package Day4.Interface;

public class InterfaceTest implements Interface1, Interface2{
        @Override
        public void add(){
            System.out.println("add metohd");
        }
        
        @Override
        public void multiply() {
            // TODO Auto-generated method stub
            Interface2.super.multiply();
        }

        @Override
        public void subtract() {
            // TODO Auto-generated method stub
            System.out.println("sub method");
        }

}

