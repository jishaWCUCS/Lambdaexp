package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LambdaExp {
    public static void main(String[] args) {
        // lambda expression to implement above
        // functional interface. This interface
        // by default implements abstractFun()
        FunctionalInterface fobj = (int x) -> System.out.print(5 + x);
        fobj.singleAbstractMethod(3);
    }
}