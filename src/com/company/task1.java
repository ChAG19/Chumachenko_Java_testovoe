package com.company;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();

        if(a == b) System.out.println("a = b");
        else if(a > b) System.out.println("a > b");
        else  System.out.println("a < b");

        System.out.printf("'+': %d\n'-': %d\n'/': %f\n'*': %d", a+b, a-b, (float)a/b, a*b);
    }
}
