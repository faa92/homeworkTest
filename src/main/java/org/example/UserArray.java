package org.example;

import java.util.Scanner;

public class UserArray {
    public static char[] getUserArray() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine().toCharArray();
    }

}
