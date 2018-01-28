package com.jnj.devicemanager.devicelist;

import android.databinding.BaseObservable;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableField;
import android.databinding.ObservableList;

import com.jnj.devicemanager.data.Device;

/**
 * Created by rl113 on 1/26/18.
 */

public class DeviceListViewModel extends BaseObservable{
    public final ObservableField<String> noDeviceTextField = new ObservableField<String>("No devices found. Please click add button to add devices.");
    public final ObservableList<Device> devices = new ObservableArrayList<Device>();

    //Tag
    public static final String TAG = DeviceListViewModel.class.getName();

    public void addNewDevice(){
        noDeviceTextField.set("value has been changed");
    }

}
