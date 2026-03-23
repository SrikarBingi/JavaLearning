package accessModifierNewPackage;

import accessModifier.Problem;

public class ProblemChild extends Problem {
    public void accessIdOfParent(){
        System.out.println(id);
    }
}
