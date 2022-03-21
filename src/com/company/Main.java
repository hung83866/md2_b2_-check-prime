package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (1>0){
            System.out.print("nhập số vào đê : ");
            int number = scanner.nextInt();
            if (number < 2){
                System.out.println("suýt nữa là số nguyên tố!");
            } else {
                int i = 2;
                boolean check = true;
                while (i <= Math.sqrt(number)) {
                    if (number % i == 0) {
                        check = false;
                        break;
                    }
                    i++;
                }
                if (check)
                    System.out.println("chuẩn!nó là số nguyên tố đấy");
                else
                    System.out.println("suýt nữa thì là số nguyên tố!");
            }
        }
    }
}
