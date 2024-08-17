// A class is a blueprint from which objects may be created.
// Classes are a way of aggregating attributes and behaviors which are logically related to each other.
class Person{
    // Attributes
    // Describes the state of the object. Composed of variables.
    public String name;
    int age;
    double weight;
    public Car car; // Because a class is a data type, it can be used as an attribute.

    // Constructor. When an object of this class is created, the constructor is always run.
    // The constructor must always be named after the class, verbatim.
    // Constructors are used to initialize the fields of an object to what is considered to be
    // a valid state, depending on the context.
    public Person(){
        name = "Alice";
        age = 30;
        weight = 200;
        car = null;
    }

    // Much like methods, constructors can be overloaded.
    public Person(String name){
        // If there exists a naming conflict between an attribute of the object and
        // one of the parameters of the method or constructor, you can resolve this
        // conflict by using the THIS keyword. THIS means the object that is running
        // the constructor.
        this.name = name;
        age = 30;
        weight = 200;
        car = null;
    }

    public Person(String name, int age){
        // You may engage in a technique called Constructor Chaining.
        // This technique helps reduce the amount of code you write, as well as prevent
        // bugs by reducing the number of places where you can type something incorrectly.
        this(name);
        this.age = age;
    }

    public Person(String name, int age, double weight){
        this(name, age);
        this.weight = weight;
    }

    // Behaviors
    // Describes actions the object can perform. Comprised of methods.
    // Note that these methods will usually NOT be static.
    public void sayName(){
        System.out.println("My name is " + name);
    }

    public int getAge(){
        return age;
    }

    public double getWeight(){
        return weight;
    }
}

// Classes can have just attributes, just methods, or a mix of both.
class Car{
    public String color;
}


public class ClassesAndObjects {
    public static void main(String[] args){
        // When you create a class, you are actually creating a new complex data type.
        // Creating a variable of that type works just like any other primitive type.
        Person p1 = new Person("Bob", 40, 100);

        // If an attribute is set to "public", you can edit it using the dot operator.
        p1.name = "Charlie";

        // You can use the method of a particular object by calling the method from that object.
        p1.sayName();


        // When creating a new object, changing its attributes will not affect the attributes
        // of any other objects
        Person p2 = new Person();
        p2.name = "David";

        p1.sayName();
        p2.sayName();

        // Because classes create a new data type, we can create an array on them.
        Person[] people = new Person[2];
        people[0] = p1;
        people[1] = p2;

        // You can access the fields and methods of an object in an array as expected.
        people[0].sayName();
        people[1].name = "Edward";
        people[1].sayName();

        Car blueCar = new Car();
        blueCar.color = "Blue";

        people[1].car = blueCar;

        System.out.println("The color of " + people[1].name + "'s car is " + people[1].car.color);
    }
}
