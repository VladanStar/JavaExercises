package com.company;

public abstract class Computer {
    public abstract String getRam();

    public abstract String getHDD();

    public abstract String getCPU();

    @Override
    public String toString() {
        return "RAM " + this.getRam() + ", HDD " + this.getHDD() + ", CPU " + this.getCPU();
    }

}
