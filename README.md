Functionalities of Lambda Expression in Java
Lambda Expressions implement the** only abstract function** and therefore implement functional interfaces lambda expressions are added in Java 8 and provide the below functionalities.
1. ** A functional interface in Java is designed to contain only one abstract method to enable the use of lambda expressions and method references, 
which are key features introduced in Java 8 for writing concise and functional-style code.**
2. If a functional interface has more than one abstract method, the lambda expression wouldn't know which method to implement.
Functional Interfaces: Lambda expressions implement single abstract methods of functional interfaces.
Code as Data: Treat functionality as a method argument.
Class Independence: Create functions without defining a class.
Pass and Execute: Pass lambda expressions as objects and execute on demand.

Here are some significant points regarding Functional interfaces in Java:


In functional interfaces, there is only one abstract method supported. If the annotation of a functional interface, i.e., @FunctionalInterface is not implemented or written with a function interface, more than one abstract method can be declared inside it. However, in this situation with more than one functions, that interface will not be called a functional interface. It is called a non-functional interface.
There is no such need for the @FunctionalInterface annotation as it is voluntary only. This is written because it helps in checking the compiler level. Besides this, it is optional.
An infinite number of methods (whether static or default) can be added to the functional interface. In simple words, there is no limit to a functional interface containing static and default methods.
Overriding methods from the parent class do not violate the rules of a functional interface in Java.
The java.util.function package contains many built-in functional interfaces in Java 8.


An abstract method in Java is a method that is declared without a body (implementation). It only has a method signature (name, parameters, and return type) 
but no implementation. It serves as a placeholder for methods that must be implemented by a subclass.

Here’s a detailed explanation:

1. Characteristics of an Abstract Method
Declaration:
It is declared using the abstract keyword.
No Body:
It does not have a method body (no {} or implementation).
Defined in Abstract Classes or Interfaces:
It must be declared inside an abstract class or an interface.
Mandatory Implementation:
Subclasses of an abstract class, or classes implementing an interface, are required to provide implementations for all abstract methods (unless the subclass is also abstract).
2. Syntax
Here’s how an abstract method looks in an abstract class:

java
Copy code
abstract class Shape {
    // Abstract method - no body
    abstract void draw();
    
    // Concrete method - has a body
    void description() {
        System.out.println("This is a shape");
    }
}
The draw() method is an abstract method and must be implemented by any non-abstract subclass of Shape.

?. Based on the syntax rules just shown, which of the following is/are NOT valid lambda expressions?
() -> {}
() -> “geeksforgeeks”
() -> { return “geeksforgeeks”;}
(Integer i) -> return “geeksforgeeks” + i;
(String s) -> {“geeksforgeeks”;}
4 and 5 are invalid lambdas, the rest are valid. Details:


 This lambda has no parameters and returns void. It’s similar to a method with an empty body: public void run() { }.  
 This lambda has no parameters and returns a String as an expression.
This lambda has no parameters and returns a String (using an explicit return statement, within a block).
return is a control-flow statement. To make this lambda valid, curly braces are required as follows: (Integer i) -> { return “geeksforgeeks” + i; }.
“geeks for geeks” is an expression, not a statement. To make this lambda valid, you can remove the curly braces and semicolon as follows: (String s) -> “geeks for geeks”. Or if you prefer, you can use an explicit return statement as follows: (String s) -> { return “geeks for geeks”; }. 
