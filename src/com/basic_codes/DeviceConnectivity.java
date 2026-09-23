package com.basic_codes;

interface Connectable {
    void connectToNetwork();
}

abstract class SmartDevice {
    protected String deviceId;
    protected String status;

    public SmartDevice(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayInfo() {
        System.out.println("Device ID : " + deviceId);
        System.out.println("Status    : " + status);
    }
}

class SmartTV extends SmartDevice implements Connectable {

    public SmartTV(String deviceId, String status) {
        super(deviceId, status);
    }

    @Override
    public void connectToNetwork() {
        System.out.println("Smart TV connected to Wi-Fi network.");
    }
}

class Smartwatch extends SmartDevice implements Connectable {

    public Smartwatch(String deviceId, String status) {
        super(deviceId, status);
    }

    @Override
    public void connectToNetwork() {
        System.out.println("Smartwatch connected via Bluetooth network.");
    }
}

class SmartSpeaker extends SmartDevice implements Connectable {

    public SmartSpeaker(String deviceId, String status) {
        super(deviceId, status);
    }

    @Override
    public void connectToNetwork() {
        System.out.println("Smart Speaker connected through Voice Assistant Cloud.");
    }
}

public class DeviceConnectivity {
    public static void main(String[] args) {

        SmartTV tv = new SmartTV("TV101", "Active");
        Smartwatch watch = new Smartwatch("SW202", "Connected");
        SmartSpeaker speaker = new SmartSpeaker("SP303", "Online");

        System.out.println("=== Smart TV ===");
        tv.displayInfo();
        
        tv.connectToNetwork();

        System.out.println("\n=== Smartwatch ===");
        watch.displayInfo();
        watch.connectToNetwork();

        System.out.println("\n=== Smart Speaker ===");
        speaker.displayInfo();
        speaker.connectToNetwork();
    }
}