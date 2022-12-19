# U4S2 Understanding Conditional Execution

* Part A - Foundations 5.1
* Part B - Foundations Practice
* Part C - Algorithm Challenge

## Part A

### Exercise 01

#### Step 01

In the package `partA.ex01` look at the file `WatchMovie`.

#### Step 02

* Modify `WatchMovie` to watch a movie that meets
  the following two conditions:
    * The movie price is greater than or equal to $12
    * The movie rating is equal to 5
      * Display the output as “I’m interested in watching the movie”
      * Else display the output as “I am not interested in watching the movie”
    * Test your program by making the price $12 and the rating a 5
  
      Your program is working correctly, if when run, the following is the output:
```
I’m interested in watching the movie
```

### Exercise 02

#### Step 01

In the package `partA.ex02` look at the file `TernaryOperator`

#### Step 02

* Modify `TernaryOperator` to duplicate the
  logic given in the if/else statement by using the ternary
  operator

### Exercise 03

#### Step 01

In the package `partA.ex03` look at the file `ComputeFare`

#### Step 02

* Examine `ComputeFare`:
  * Implement the following using if/else constructs:
    * Declare an integer variable, age
    * Have the user enter the value for age
  * Using a chained if construct, compute the fare based
    on the age according to these conditions:
    * If age is less than 11, then fare=3$
    * If age is greater than 11 and less than 65, then fare=5$
    * Else for all other ages, then fare=3$
    * Run your program for the age 27
    
      Your program is working correctly, if when run, the following is the output:
```
fare=5$
```


## Part B

### Exercise 01

#### Step 01

In the package `partB.ex01` look at the file `ChainedIfExample` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `partB.ex01` complete the `CheckGrades` per the following:

* Create a program that receives various grades from the user including: Math, Science, Geography, English, and Java
* Total the inputs and state what the total was in the five subjects
* Print out the average and call it a percentage per the sample below

Your program is working correctly, if when run, the following is the output:

```
What was your grade in Math?
80
What was your grade in Science?
75
What was your grade in Geography?
80
What was your grade in English?
75
What was your grade in Java?
80
Total grade in five subjects: 390.0
My percentage: 78.0
```

> Use ChainedIfExample for reference.

### Exercise 02

#### Step 01

In the package `partB.ex02` look at the file `TernaryOperatorExample` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `partB.ex02` complete the `Ternary` per the following:

* Create a program that has two numerical variables - x and y
* Assign a value of 20 to x
* Perform a logical ternary check that will assign 90 to y after checking whether the value of x is equal to 1
* Print out "value of y is: " + y
* Perform a second logical ternary check that will assign 61 to y after checking whether the value of x is equal to 20
* Print out "value of y is: " + y

Your program is working correctly, if when run, the following is the output:

```
Value of y is: 90
Value of y is: 61
```

> Use TernaryOperatorExample for reference.

## Part C

### Exercise 01

#### Step 01

In the package `partC` look at the file `AlgoChallenge`

#### Step 02

### Problem 1
Determine if the given string contains between 1 and 3 'e' characters.
Only if the string contains between 1 and 3 'e' characters; return true.

Example:
```java
containE("Hello") --> true
containE("Heelle") --> true
containE("Heelele") --> false
```
### Problem 2
An elementary school teacher needs your help to create new strings for a fun activity they have planned. You will be
provided a non-empty string and a number N. To create a new string, you will start with the character 0. Next you will
add every Nth character of the string to the new string.

Return the new string.

Tip: If N is 3, use char 0, 3, 6 ... and so on. N is 1 or more.

Example:
```java
everyOther("Miracle", 2) --> "Mrce"
everyOther("abcdefg", 2) --> "aceg"
everyOther("abcdefg", 3) --> "adg"
```

