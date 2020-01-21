# Java-OOP
short oop concepts in java

## Encapsulation

The file encapsulation.java demonstrates the concept of Encapsulation. A variable x is set to private, which means that other classes outside the current class cannot access the variable x.

However, getX() method is implemented in the class. Thus, the other classes can still read the value of X from the getX() method but cannot modify it (a read-only variable). Thus, x cannot be easily mutated and is "protected" from other classes.

## Inheritance

The files Inheritance.java and Child.java demonstrate the concept of inheritance. Class Child inherits from class Inheritance. We can see that in the constructor for Child.java, it calls the super's constructor, passing the values of x and y so the parent can initialize it in their own constructor. We can extend this concept for methods and variables as well, for example the x, y variables which are present in the parent and not in the child, yet the child can still access these variables. 

## Polymorphism

The files CompileTimePolymorphism.java and RuntimePolymorphism.java showcase examples of compile time and runtime polymorphism.

### Compile Time Polymorphism

In CompileTimePolymorphism.java, we see an example of method overloading, where the method has the same name but yet different parameters. This helps ensure that the same method can be used more generically depending on how it's called, with different implementations. This is an example of compile time polymorphism, since the different implementations of the method is determined at compile time.

### Runtime Polymorphism

In RuntimePolymorphism.java, we see an example with three Child classes implementing the same interface. They each have the same method abc() defined, and since they all inherit from the same class, we can have an array of the Parent class, which contains instances of child classes. As such we can call the methods abc generically on any member of the array and return unique implementations based on how it was defined in each individual class. This is thus an example of runtime polymorphism, since each implementation is determined at runtime.  

## Abstraction

In Abstraction.java, an abstract class Shape has been defined, with an unimplemented area() method. This area method is then overridden by each of the children of the abstract class Shape, which provide their own implementations of the area() method. Since we do not need to know how each Shape's area is calculated specifically when declaring the object and calling the method, this qualifies as abstraction.

