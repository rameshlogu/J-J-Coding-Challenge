package com.jnj.devicemanager.devicelist;

import android.databinding.BaseObservable;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableField;
import android.databinding.ObservableList;

import com.jnj.devicemanager.data.Device;

import java.util.Random;

/**
 * View model for the device list view
 */

public class DeviceListViewModel extends BaseObservable{
    public final ObservableField<String> noDeviceTextField = new ObservableField<String>("No devices found. Please click add button to add devices.");
    public final ObservableList<Device> devices = new ObservableArrayList<Device>();

    //Tag
    public static final String TAG = DeviceListViewModel.class.getName();

   /**
     * Provision to add a new device
     */
    public void addNewDevice(){
        Device device = new Device();
        device.setDevice("Pixel "+ new Random().nextInt());
        device.setOs("Android 8.0 "+new Random().nextInt());
        device.setLastCheckedOutBy("Ramesh");
        devices.add(device);
    }

}
