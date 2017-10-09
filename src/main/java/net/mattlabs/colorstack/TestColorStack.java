package net.mattlabs.colorstack;

import java.util.Random;

public class TestColorStack {
    public static void main(String[] args) {

        // Create random object
        Random random = new Random();
        // Create new color stack with capacity 500
        System.out.println("Creating new ColorStack of total capacity 500...\n");
        ColorStack colorStack = new ColorStack(500);

        // Fill first 50 indices of the red stack
        System.out.println("Filling first 50 indices of the red stack...");
        for (int count = 0; count < 50; count++) {
            colorStack.pushRed(random.nextInt(100) + 1);
        }

        // State current size
        System.out.println("The current size of the red stack is "
                                + colorStack.sizeRed()
                                + " items.\n");

        // Fill all 250 indices of the blue stack
        System.out.println("Filling all indices of the blue stack...");
        for (int count = 0; count < 250; count++) {
            colorStack.pushBlue(random.nextInt(100) + 1);
        }

        // State current size
        System.out.println("The current size of the blue stack is "
                                + colorStack.sizeBlue()
                                + " items.\n");

        // Get top item of blue stack
        System.out.println("The top item of the blue stack is "
                                + colorStack.topBlue()
                                + ".\n");

        // Attempt to add new item to blue stack
        System.out.println("Attempting to add new item to full blue stack...");
        try {
            colorStack.pushBlue(random.nextInt(100) + 1);
        } catch (IllegalStateException e) {
            System.out.println("Error: Blue stack is full.");
        }

        // Pop top of blue stack and add new item
        System.out.println("Popping the top item of the blue stack...\n" +
                "The popped item is " + colorStack.popBlue() + ".");
        System.out.println("The current size of the blue stack is "
                                + colorStack.sizeBlue()
                                + ".");
        System.out.println("Adding new item to blue stack...");
        colorStack.pushBlue(random.nextInt(100) + 1);
        System.out.println("The top item in the blue stack is now "
                                + colorStack.topBlue()
                                + ".\n");

        // Remove all 50 items from the red stack
        System.out.println("Removing 50 items from the red stack...");
        for (int count = 0; count < 50; count++) {
            colorStack.popRed();
        }
        System.out.println("The size of the red stack is now "
                                + colorStack.sizeRed()
                                + ".");
        if (colorStack.isEmptyRed()) System.out.println("Red stack is now empty.");
    }
}
