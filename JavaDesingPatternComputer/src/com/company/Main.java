package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // da napravimo objekat u jednoj liniji koda
         Computer pc1 = new Computer.ComputerBuilding("12Gb","4GB","3.4GHz" ).build();
        Computer pc2 = new Computer.ComputerBuilding("12Gb","16GB","2.4GHz" ).setGraphicCardEnabled(true).setBluetootEnabled(true).build();
        Computer pc3 = new Computer.ComputerBuilding("16GB","8GB","3.6").setBluetootEnabled(true).build();
        System.out.println("PC1 = " +pc1.toString());
        System.out.println("PC2 = " + pc2.toString() );
        System.out.println("PC3 = " + pc3.toString());
    }
}
