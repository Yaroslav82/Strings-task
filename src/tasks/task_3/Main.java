package tasks.task_3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    private final static String[] NAMES = new String[]{"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};

    private final static String OCCURS_ZERO = "Name '%s' is not found";
    private final static String OCCURS_ONCE = "Name '%s' occurs once in the list";
    private final static String OCCURS_SEVERAL = "Name '%s' occurs %d times in the list";

    public static void main(String[] args) {
        String name = getName();
        print(name, findName(name));
    }

    /**
     * Capitalize all letters of the name we entered into the console and then returns it.
     *
     * @return the {@code String} that we entered into the console.
     */
    private static String getName() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        String name = "";

        while (name.length() < 1) {
            System.out.print("Enter name: ");
            name = scanner.nextLine();
        }

        return capitalize(name);
    }

    /**
     * Convert the first character of a string to uppercase and the remaining characters to lowercase.
     *
     * @param str the {@code String} to be converted.
     * @return converted {@code String}.
     */
    private static String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    /**
     * Searches for the number of the {@code name} in an array of constants {@code NAMES}.
     *
     * @param name the {@code String} to find out the amount of.
     * @return {@code int} amount of name mentions in {@code NAMES}.
     */
    private static int findName(String name) {
        int count = 0;

        for (String el : NAMES) {
            if (name.equals(el)) {
                count++;
            }
        }

        return count;
    }

    /**
     * Prints the name and its number in the array to the console.
     *
     * @param name  {@code String} to print
     * @param count {@code int} count of the name in the array
     */
    private static void print(String name, int count) {
        if (count == 1) {
            System.out.printf(OCCURS_ONCE, name);
        } else if (count != 0) {
            System.out.printf(OCCURS_SEVERAL, name, count);
        } else {
            System.out.printf(OCCURS_ZERO, name);
        }
        System.out.println();
    }
}
