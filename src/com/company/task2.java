package com.company;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        String a = scanner.next();
        System.out.print("b: ");
        String b = scanner.next();

        if(a.equals(b)) System.out.println("������ ���������/identical");
        else System.out.println("������ �����������/not identical");
    }
}