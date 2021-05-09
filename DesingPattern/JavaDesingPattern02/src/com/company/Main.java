package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // get an object of PC and call ist method
        Computer pc = ComputerFactory.getInstance().getComputer("PC ", "4GB", "800MHz", "16GB");
        Computer server = ComputerFactory.getInstance().getComputer("server", "32GB", "3200MHz", "1TB");
        System.out.println("PC = " + pc);
        System.out.println("Server =  " + server);
    }
}
