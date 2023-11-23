# Recursion and Backtracking

## Introduction

In this section we will look at recursion and its relative _backtracking_

## What is Recursion?

Any function that calls itself is recursive. 
A recursive method solves itself by calling itself with smaller chunks of the problem.
This is known as the recursive step - once the problem can be solved without calling itself
the recursion terminates. This condition for the termination is known as the base case.

## Why Recursion?

Recursion is useful when you want to write a short and easier to write
solution to a longer iterative problem.

Most often times the iterative code is compiled into recursive code anyways.
This is useful for problems for sort, search and traversals. 

## Format of a Recursion

```java
class Recursion {
    public static void recurse(int num) {
        // Base cases
        if(baseCase) {
            return some_value;
        } else if(anotherBaseCase) {
            return other_value;
        } else {
            // Recursion of some sort
            return (num - 1);
        }
    }
}
```

## Recursion and Memory

Each recursive call makes a new copy of that method (just the variables) in memory.
Once a method ends (by returning data), the copy of the returning method is removed 
from memory. 

## Recursion versus Iteration

**Recursion**

- Terminates when a base case is reached
- Each recursive call requires extra space on the stack frame (memory)
- If we get infinite recursion, the program may run out of memory and give a stack overflow.
- Solutions to some problems are easier to formulate recursively.

**Iteration**

- Terminates when a condition is proven to be false
- Each iteration does not require extra space
- An infinite loop could loop forever since there are no extra memory being created. 
- Iterative solutions to a problem may not always be as obvious as the recursive ones.

## Examples of Recursive Problems

1. Fibonacci Series, Factorial Finding
2. Merge Sort, Quick Sort
3. Binary Search
4. Tree Traversals
5. Graph Traversals
6. Dynamic Programming 
7. Divide and Conquer
8. Towers of Hanoi
9. Backtracking 