package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Unesite vase godine: ");
        Scanner input = new Scanner(System.in);
        int godine = input.nextInt();
        if(godine >18){
            System.out.println("Bravo. Vi ste punoletni");
        }
        else {
            System.out.println("Na zalost niste punoletni.");
        }
    }
}
