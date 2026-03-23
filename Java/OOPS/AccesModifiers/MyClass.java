public class MyClass {
    // access to world
    public int publicVar=10;

    //access to only this class
    private int privateVar=20;

    //access to same package, same class, sub class
    protected int protectedVar=30;

    // access to same package, same class
    int defaultVar=40;

    void print(){
        System.out.println(privateVar);
    }
}