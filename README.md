# Review

## Definition of an algorithm
A series of 
* Unambiguious 
* Ordered
* Executable steps
* That define a terminating process


## Write & Read Pseuldocode
* Can be written in JETS, AKA just write it in Java.

## Read IB Flowcharts

## Read Gant Charts

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

## Concurrency vs Sequential
### Cocurrency
Cocurrent tasks are tasks that are happening simultaneously 

### Sequential
Sequential tasks are tasks that happen one after each other, and do notoverlap


## Big O Notation
Big O Notation is a measure of how well an algorithm performs as inputs scale.

## Sort & Search Algorithms
### Linear Search
O(n)
### Binary Search
O(log(n))
### Selection Sort
O(n<sup>2</sup>)
### Bubble Sort
O(n<sup>2</sup>)

## Collection
### Methods
* isEmpty()
* getNext()
* hasNext()
* resetNext()
* add()

### Sample Questions can be from

## Advantages of Modularity

## Fundamental Operations of a Computer

## Properties of programming languages

## Compiler vs Intepreter

## Virtual Machine

## Fundamental parts of programming languages (define & use)
* Variable
  * You will most liekly not be asked this, you should know what this is.
* Constant
  * Variable that cannot change
* Operator
  * idk how to define this
* Object

## Nature of an Object

## Define a Class vs Object

## Components of Classes

## UML

## UML Relationships

## Encapsulation

## Inheritance

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

## Define public, protected, private, & package

## Define & Use of static methods

## Moral & Ethical Considerations