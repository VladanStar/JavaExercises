package com.company;

public class Computer {
    private String HDD;
    private String RAM;
    private String CPU;

    // optional parameter
    private boolean isBlouetoothenagled;
    private boolean isGraphicCardEnabled;

    private Computer(ComputerBuilding computerBuilding) {
        this.HDD = computerBuilding.HDD;
        this.RAM = computerBuilding.RAM;
        this.CPU = computerBuilding.CPU;
        this.isBlouetoothenagled = computerBuilding.isBlouetoothenagled;
        this.isGraphicCardEnabled = computerBuilding.isGraphicCardEnabled;
    }

    public String getHDD() {
        return HDD;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public boolean isBlouetoothenagled() {
        return isBlouetoothenagled;
    }

    public void setBlouetoothenagled(boolean blouetoothenagled) {
        isBlouetoothenagled = blouetoothenagled;
    }

    public boolean isGraphicCardEnabled() {
        return isGraphicCardEnabled;
    }

    public void setGraphicCardEnabled(boolean graphicCardEnabled) {
        isGraphicCardEnabled = graphicCardEnabled;
    }

    // unutrasnja klasa builder
    public static class ComputerBuilding {
        private String HDD;
        private String RAM;
        private String CPU;

        // optional parameter
        private boolean isBlouetoothenagled;
        private boolean isGraphicCardEnabled;

        public ComputerBuilding() {
        }

        public ComputerBuilding(String HDD, String RAM, String CPU) {
            this.HDD = HDD;
            this.RAM = RAM;
            this.CPU = CPU;
        }

        public ComputerBuilding setGraphicCardEnabled(boolean b) {
            this.isGraphicCardEnabled = isGraphicCardEnabled;
            return this;
        }

        public ComputerBuilding setBluetootEnabled(boolean b) {
            this.isBlouetoothenagled = isBlouetoothenagled;
            return this;
        }

        public Computer build() {
            return new Computer(this
            );
        }
    }

}
