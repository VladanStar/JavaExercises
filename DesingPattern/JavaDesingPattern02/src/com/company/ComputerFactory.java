package com.company;

public class ComputerFactory {
    private static ComputerFactory instance = null;

    public ComputerFactory() {
    }

    public static ComputerFactory getInstance() {
        if (instance == null) {
            instance = new ComputerFactory();
        }
        return instance;
    }

    public Computer getComputer(String type, String Ram, String HDD, String CPU) {
        if (type.equalsIgnoreCase("PC")) {
            return new PC(Ram, HDD, CPU);
        } else if (type.equalsIgnoreCase("Server")) {
            return new Server(Ram, HDD, CPU);
        } else {
            return null;
        }
    }
}
