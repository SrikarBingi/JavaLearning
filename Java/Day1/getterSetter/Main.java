package getterSetter;

import accessModifier.Problem;

public class Main {
    public static void main(String[] args) {
       ProblemGetterExample problemGetterExample = new ProblemGetterExample();

       problemGetterExample.setId(10);
       System.out.println(problemGetterExample.getId());
        //problemGetterExample.id=57;
        //problemGetterExample.getId();
        //problemGetterExample.id = 57;

    }
}
