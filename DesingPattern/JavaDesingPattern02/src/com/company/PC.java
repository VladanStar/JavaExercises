package com.company;

public class PC extends Computer {
    private String Ram;
    private String HDD;
    private String CPU;

    public PC() {
    }

    public PC(String Ram, String HDD, String CPU) {
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
