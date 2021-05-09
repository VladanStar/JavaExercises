package com.company;

public class Server extends Computer {
    private String Ram;
    private String HDD;
    private String CPU;

    public Server() {
    }

    public Server(String Ram, String HDD, String CPU) {
        this.Ram = Ram;
        this.HDD = HDD;
        this.CPU = CPU;
    }

    @Override
    public String getRam() {
        return this.Ram;
    }

    @Override
    public String getHDD() {
        return this.HDD;
    }

    @Override
    public String getCPU() {
        return this.CPU;
    }
}
