package Day4.Interface;

public interface Interface1 {
    void add();
    default void multiply(){
        System.out.println("Interface 1");
    }
}
