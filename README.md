# __Review__



## Write & Read Pseuldocode
Can be written in JETS, AKA just write it in Java.

## Read IB Flowcharts
The flowchart guide will be provided to you on the test, but I don't think the majority of people will need it and you will most likely only use it if you want to double check yourself.


## Read Gant Charts
<img src="https://i.ytimg.com/vi/JHCZaRcYHpU/maxresdefault.jpg"/>
Self Explanatory how to read, you will not need to create one yourself.

## Concurrency vs Sequential
### Cocurrency
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

## Sort & Search Algorithms
Each Algorithm has it's own pseuldo code in this git repository, go to the top of the page and go into the 'algorithms' folder for more. ([here](./algorithms/))
### [Linear Search]()
O(n)
### [Binary Search](./algorithms/BinarySearch.java)
O(log(n))
### [Selection Sort]()
O(n<sup>2</sup>)
### [Bubble Sort]()
O(n<sup>2</sup>)

## Collection
### Methods
* isEmpty()
* getNext()
* hasNext()
* resetNext()
* add()

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
TODO

## Fundamental parts of programming languages (define & use)
* Variable
  * You will most liekly not be asked this, you should know what this is.
* Constant
  * Variable that cannot change
* Operator
  * idk how to define this
* Object

## Nature of an Object
TODO

## Define a Class vs Object
TODO

## Components of Classes
TODO

## UML
TODO

## UML Relationships
TODO

## Encapsulation
TODO

## Inheritance
TODO

## Polymorphisism

## Advanteges of Libraries

## OOP 

## Use of programming teams

## Define Identifier, Instance, Parameter, Primitives

## Accessor & Mutators

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
## Define & Use of static methods & variables
### Define
Static methods and variables are methods & variables that belond to all instances of a class, rathern than specific ones. Exampels of these include all methods and variables from the `java.lang.Math` class, such as `Math.sin()` or `Math.PI`

### Use
We use static methods when we need multiple classes to have shared data or functionality.

## Moral & Ethical Considerations