package accessModifier;

import accessModifierNewPackage.ProblemChild;

public class Main {

    public static void main(String[] args) {




        Problem problem = new Problem();
        ProblemChild problemChild = new ProblemChild();
        System.out.println(problem.id);
        problemChild.accessIdOfParent();
    }
}
