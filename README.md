# __Review__



## Write & Read Pseuldocode
Can be written in JETS, AKA just write it in Java.

## Read IB Flowcharts
The flowchart guide will be provided to you on the test, but I don't think the majority of people will need it and you will most likely only use it if you want to double check yourself.


## Read Gant Charts
<img src="https://i.ytimg.com/vi/JHCZaRcYHpU/maxresdefault.jpg"/>
Self Explanatory how to read, you will not need to create one yourself.

## Concurrency vs Sequential
### Concurrency
Cocurrent tasks are tasks that are happening simultaneously 

### Sequential
Sequential tasks are tasks that happen one after each other, and do notoverlap

## Definition of an algorithm
A series of 
* Unambiguious 
* Ordered
* Executable steps
* That define a terminating process
## Define and label pre & post conditions
### Pre Condition
A pre condition is a condition that the algorithm assumes is true
### Post Condition
A post condition is a condition you assume is true of the output of the algorithm

### Example Case: Binary Sort
#### Pre Condition
The array is sorted
#### Post Condition
The algorithm found whether or not the target is in the array sucessfully 



## Big O Notation
Big O Notation is a measure of how well an algorithm performs as inputs scale.
[![Big O Notation in 100 seconds](http://img.youtube.com/vi/g2o22C3CRfU/0.jpg)](https://youtu.be/g2o22C3CRfU "Big O Notation")

## Sort & Search Algorithms
Each Algorithm has it's own pseuldo code in this git repository, go to the top of the page and go into the 'algorithms' folder for more. ([here](./algorithms/))
* [Linear Search](./algorithms/LinearSearch.java)
* [Binary Search](./algorithms/BinarySearch.java)
* [Selection Sort](./algorithms/SelectionSort.java)
* [Bubble Sort](./algorithms/BubbleSort.java)

## Collection
### Methods
* isEmpty()
* getNext()
* hasNext()
* resetNext()
* add()

[Example Problems](./collections)

## Advantages of Modularity
* Avoids code duplication / Allows for Reusability
* Makes codebase more organized

## Fundamental Operations of a Computer
* Add 
* Compare 
* Store (Write)
* Retrieve (Read)

## Properties of programming languages

### Grammar / Syntax
ex . Curly braces vs Indentations (Python vs Java)

### High / Low Level
ex . Assembly vs Java

### Compiler vs Intepreter
#### Compiler
A compiled langauge is a langauge where the programming code is converted into machine code **ONCE** and then can be run natively on different devices. 

ex. C, C++, Rust

#### Intepreter
A intepreted language is a language where the programming code is fed into a program and it runs the code **LINE BY LINE** each time it runs.

ex. Python, Javascript

#### Java
Java is both intepreted AND compiled because it compiles to a special Java Bytecode, and run through an intepreter (eg. the Java Virtual Machine / Runtime Enviorment)

## Virtual Machine
A virtual machine is a machine that is simulated inside another with sandboxes memory, this includes emulators (ex. Dolphin Emulator) and also includes things like the JRE (Java Runtime Enviorment) which is used to run Java bytecode on your machine.

### Advantages:
* Memory is sandboxed so it increases security for if you want to test things like viruses
* Allows for easier cross-platform use (specifically Java JRE) be cause you compile once and you just give your program to machines that have the JRE

## Fundamental parts of programming languages (define & use)
* Variable
  * You will most liekly not be asked this, you should know what this is.
* Constant
  * Variable that cannot change
* Operator
  * idk how to define this
* Object

## Define a Class vs Object
TODO **(dm if you have a precise definition because I can't find one in my notes)**

## UML
If you've done B3 then you know this hell already.

## UML Relationships
__A__ is a __B__
A --> B

__A__ has a __B__
A <>-- B

__A__ uses __B__
TODO

## Encapsulation
Encapsulation is classes making their data private and controlling access through accessors and mutators.

### Accessor & Mutators
I.B. Fancy word for setters and getters

Without Accessors & Mutators:
```java
public class Person {
    public String name;
    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName) {
        this.name = firstName + " " + lastName;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
```

With Accessors & Mutators
```java
public class Person {
    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String name) {
        firstName = name;
    }

    public void setLastName(String name) {
        lastName = name;
    }

    public void getFirstName() {
        return firstName;
    }

    public void getLastName() {
        return lastName;
    }

    public void getName() {
        return firstName + " " + lastName;
    }
}
```
### Advantages
* Classes have control of who accesses and sets their data
* Classes can pair functionality with the action of setting or getting their own data

## Bogosort
```java

void bogosort(int[] arr) {
    while (!isSorted(arr)) {
        shuffle(arr);
    }
}

boolean isSorted(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            return false;
        }
    }
    return true;
}

void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

void shuffle(int[] arr) {
    for (int i = 0; i arr.length; i++) {
        int n = (int)
            (Math.random()*arr.length);

        swap(arr, i, n);
    }
}
```

## Inheritance
Allows one class to inherit both **behaviours** and **attributes** of a **single** parent class.
### Advantages:
* Avoids duplicate code
* Simplifies testing
* Simplifies refactoring

## Polymorphisism
"Many Form"
Two types:
### Override
A method with the same name as a method in the class, but different parameters.

### Overload
Overrides functionality of a parent class

## Advantages of Libraries
* Allows you to outsource work
* You can trust proffessionals 

## OOP 
Abstraction of data into 'classes' and follows ideas of Polymorphisism, Inheritance, and Encapsulation.

### Disadvantages
* Inefficient for small programs
* Steep learning curve
* Large boilerplate code / program size


## Use of programming teams
TODO
* Allows to segment work 
* Can give specialized tasks
* 

## Define Identifier, Instance, Parameter, Primitives

```java
public void bogo(int age) {
    Scanner kb = new Scanner();
}

```
### Identifiersfa
A name for a variable or instance or class or method, in the example identifiers would be 'age', 'kb', 'bogo', 'Scanner' 

### Instance
An instance is a constructed instance of a class, in the example 'kb' would be an instance variable.

### Parameter
A parameter is a variable that a method expects to be recieved when run, in the example 'age' would be a parameter of the method.

### Primitives
A primitive data type is a base data type that is not a class, and typically universal. In the example a primitive type would be 'int' but not 'Scanner' because 'Scanner' is a class.

Examplse of primitives:
* float
* double
* int
* long
* char
* boolean
* short
* byte
* **NOT** arrays, you can have arrays of primitives, but the array as a whole is **NOT** a primitive


## Method Signatures
```java
public static int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return i;
        }
    }
    return -1;
}

```
would have a method signature of: 
```java
public static int linearSearch(int[] arr, int target)
```

Mr.Ansari says its disputed whether or not to include the return type, but I.B. will not take points off if you include it.

## Define public, protected, private, and default access

### Public
```java
public void bogosort(int[] arr)
```
Method is available to ALL packages and other classes

### Protected
```java
protected void bogosort(int[] arr)
```
Method is available to only the current class **AND** all subclasses (classes that inherit from class this was defined in) **AND** classes ini the same package as it the method was defined in.

### Private
```java
private void bogosort(int[] arr)
```
method is available only to the class that it was defined in, it is blocked from use from **all other classes including subclasses**. 

### Default
```java
void bogosort(int[] arr)
```
Method is able to be accessed from all classes **within the same package as the class it was defined in** but **not any subclasses**


## Packages
Packages are a collection of classes 
## Define & Use of static methods & variables
### Define
Static methods and variables are methods & variables that belond to all instances of a class, rathern than specific ones. Exampels of these include all methods and variables from the `java.lang.Math` class, such as `Math.sin()` or `Math.PI`

### Use
We use static methods when we need multiple classes to have shared data or functionality.

## Moral & Ethical Considerations
* Human Rights
* Privacy
* Acountability
* others TODO