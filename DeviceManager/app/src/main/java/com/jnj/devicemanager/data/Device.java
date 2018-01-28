package com.jnj.devicemanager.data;

/**
 * Created by rl113 on 1/26/18.
 */

public class Device {
    private int id;
    private String device;
    private String os;
    private String manufacturer;
    private String lastCheckedOutDate;
    private String lastCheckedOutBy;
    private boolean isCheckedOut;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getLastCheckedOutDate() {
        return lastCheckedOutDate;
    }

    public void setLastCheckedOutDate(String lastCheckedOutDate) {
        this.lastCheckedOutDate = lastCheckedOutDate;
    }

    public String getLastCheckedOutBy() {
        return lastCheckedOutBy;
    }

    public void setLastCheckedOutBy(String lastCheckedOutBy) {
        this.lastCheckedOutBy = lastCheckedOutBy;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }
}
