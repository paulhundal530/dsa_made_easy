package org.example.recursion;

/**
 * Recursion Problem:
 * 
 * Towers of Hanoi is a mathematical puzzle you can look up.
 * It consists of three rods, and a number of disks of different sizes which can slide
 * onto any rod. The puzzle starts with the disks on one rod in ascending order of size, 
 * the smallest at the top, making a cone shape.
 * 
 * The objective of the puzzle is to move the entire stack to another rod, 
 * satisfying the following rules:
 * 
 * 1. Only one disk may be removed at a time
 * 2. Each move consists of taking the upper disk from one of the rods and sliding it
 * onto another rod, on top of the other disks that may already be present on that rod. 
 * 3. No disk may be placed on a top of a smaller disk. 
 */
public class TowersOfHanoi {

    public static void main(String[] args) {

    }

    /**
     * Algorithm
     * 
     * 1. Move the top n-1 disks from Source to Auxiliary tower
     * 2. Move the nth disk from Source to Destination tower
     * 3. Move the n-1 disks from Auxiliary to Destination tower
     * 4. Transferring the top n-1 disks from Source to Auxiliary tower can again be
     * thought as a fresh problem and can be solved in the same manner. Once we solve 
     * Tower of Hanoi with three disks, we can solve it with any number of disks with
     * the above program.
     */

    public static void move(int n, char from, char to, char aux) {
        // Start with the base case:
        // If only 1 disk then make the move and return
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }

        // Move the top n-1 disks from A to B, using C as auxiliary
        move(n-1, from, aux, to);

        // Move remaining disks from A to C
        System.out.println("Move disk from " + from + " to " + to);

        // Move n-1 disks from B to C using A as auxiliary
        move(n-1, aux, to, from);
    }
}
