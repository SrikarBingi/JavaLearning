package accessModifier;

public class Problem {
    //default scope is package specifc
    protected String id="10";
    private String desc;

    public void printId(){
        System.out.println(id);
    }
}
