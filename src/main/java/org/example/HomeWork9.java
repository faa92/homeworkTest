package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class HomeWork9 {
    private static final Logger log = LoggerFactory.getLogger("HomeWork9");

    public static void main(String[] args) {
        log.info("Программа запущена");
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите номер задачи (2-5): ");
            int task = scanner.nextInt();

            switch (task) {
                case 2 -> {
                    System.out.print("Введите строку: ");
                    char[] string = UserArray.getUserArray();
                    System.out.println("Строка пустая? -> " + StringUtils.isBlank(string));
                }
                case 3 -> {
                    System.out.print("Введите строку: ");
                    char[] string = UserArray.getUserArray();
                    System.out.println("Строка на Русском языке? ->" + StringUtils.isRussia(string));
                }
                case 4 -> {
                    System.out.println("Является ли массив подмассивом первого");
                    System.out.print("Введите строку: ");
                    char[] arr = UserArray.getUserArray();
                    System.out.print("Введите подстроку: ");
                    char[] subArr = UserArray.getUserArray();
                    System.out.println(StringUtils.contains(arr, subArr));
                }
                case 5 -> {
                    System.out.print("Введите строку десятичных чисел: ");
                    char[] arr = UserArray.getUserArray();
                    System.out.println(StringUtils.parseInt(arr));
                }

            }
        } while (true);
    }
}