package org.example;

@java.lang.FunctionalInterface
public interface FunctionalInterface {

    // Functional interface only contains single abstract method
    // but can have default and static methods
    void singleAbstractMethod(int x);

    static void calculate(int x, int y){
        int z = x*y;
    }
}
