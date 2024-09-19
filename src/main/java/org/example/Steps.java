package org.example;

import java.util.Scanner;

/**
 * Calculates how many jumps you need to climb a total number of steps
 * */
public class Steps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many cases are you introducing?");
        int numCases = scanner.nextInt();

        for (int i = 0; i < numCases; i++) {
            System.out.println("How many steps are you climbing?");
            int totalSteps = scanner.nextInt();
            System.out.println("And how many can you climb at a time?");
            int stepsPerJump = scanner.nextInt();

            int jumpsNeeded = totalSteps / stepsPerJump;
            if (totalSteps % stepsPerJump == 0) {
                System.out.println("You will need " + jumpsNeeded + " jumps");
            } else {
                jumpsNeeded++;
                System.out.println("You will need " + jumpsNeeded + " jumps");
            }
        }

    }
}