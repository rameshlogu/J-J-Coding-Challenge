package com.jnj.devicemanager.devicelist.adapter;

import android.databinding.BaseObservable;
import android.databinding.Observable;
import android.databinding.ObservableField;

import com.jnj.devicemanager.data.Device;

/**
 * View model for list item view
 */
public class DeviceListItemViewModel extends BaseObservable {

    //View fields
    public final ObservableField<String> titleField = new ObservableField<>();
    public final ObservableField<String> lastCheckedOutByField = new ObservableField<>();
    private final ObservableField<Device> mDeviceObservableField = new ObservableField<>();

    /**
     * Constructor
     */
    public DeviceListItemViewModel() {
        //Add observer callback for the item
        mDeviceObservableField.addOnPropertyChangedCallback(new OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable observable, int i) {
                Device device = mDeviceObservableField.get();
                if(device != null) {
                    titleField.set(device.getTitleForList());
                    lastCheckedOutByField.set(device.getLastCheckedOutBy());
                }
            }
        });
    }

    /**
     * Set the device item object
     * @param device the device item object
     */
    public void setDevice(Device device){
        mDeviceObservableField.set(device);
    }
}
