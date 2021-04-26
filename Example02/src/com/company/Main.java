package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Aplikacija koja pomaze profesoru da da ocenu studentu:");
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite broj poena studenta: ");
        int poeni = input.nextInt();
        System.out.println("Poeni moraju biti u intervalu od 1 do 100.");
        int ocena = 0;
        if (poeni < 100 || poeni > 0) {

            System.out.println("Uneli ste pogresan unos");
            System.exit(0);
        }

        if (poeni >= 91) {
            System.out.println("Ocena je 10");
            ocena = 10;
        } else if (poeni >= 81) {
            System.out.println("Ocena je 9");
            ocena = 9;
        } else if (poeni >= 71) {
            System.out.println("Ocena je 8");
            ocena = 8;
        } else if (poeni >= 61) {
            System.out.println("Ocena je 7");
            ocena = 7;
        } else if (poeni >= 51) {
            System.out.println("Ocena je 6");
            ocena = 6;
        } else {
            System.out.println("Na zalost pali ste ispit. Vasa ocena je 5.");
        }
        System.out.println("Vasa ocena je : " + ocena);
    }


}

