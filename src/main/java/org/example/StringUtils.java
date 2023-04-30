package org.example;

public class StringUtils {

    public static void print(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void println(char[] arr) {
        print(arr);
        System.out.print("\n");
    }

    public static boolean isBlank(char[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (!Character.isWhitespace(arr[i])) {
                return false;
            }
        }
        return true;
    }


    public static boolean isRussiaOneChar(char ch) {
        return (ch >= 'А' && ch <= 'я') || ch == 'ё' || ch == 'Ё';
    }

    public static boolean isRussia(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (!isRussiaOneChar(arr[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean contains(char[] arr, char[] subArr) {
        for (int i = 0; i <= arr.length - subArr.length; i++) {
            boolean equal = true;
            for (int j = 0; j < subArr.length; j++) {
                if (arr[i + j] != subArr[j]) {
                    equal = false;
                    break;
                }
            }
            if (equal) {
                return true;
            }
        }
        return false;
    }

    public static int parseInt(char[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!Character.isDigit(arr[i])) {
                throw new IllegalArgumentException("Элемент массива не число!");
            }
            int digit = arr[i] - '0';
            result = result * 10 + digit;
        }
        return result;
    }


}

