Functionalities of Lambda Expression in Java
Lambda Expressions implement the** only abstract function** and therefore implement functional interfaces lambda expressions are added in Java 8 and provide the below functionalities.
1. ** A functional interface in Java is designed to contain only one abstract method to enable the use of lambda expressions and method references, 
which are key features introduced in Java 8 for writing concise and functional-style code.**
2. If a functional interface has more than one abstract method, the lambda expression wouldn't know which method to implement.
Functional Interfaces: Lambda expressions implement single abstract methods of functional interfaces.
Code as Data: Treat functionality as a method argument.
Class Independence: Create functions without defining a class.
Pass and Execute: Pass lambda expressions as objects and execute on demand.


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
