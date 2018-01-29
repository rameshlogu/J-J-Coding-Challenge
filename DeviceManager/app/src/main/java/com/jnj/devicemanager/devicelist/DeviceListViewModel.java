package com.jnj.devicemanager.devicelist;

import android.databinding.BaseObservable;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableField;
import android.databinding.ObservableList;
import android.support.annotation.MainThread;

import com.jnj.devicemanager.data.Device;
import com.jnj.devicemanager.data.remote.DeviceRemoteDataSource;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * View model for the device list view
 */

public class DeviceListViewModel extends BaseObservable{
    public final ObservableField<String> noDeviceTextField = new ObservableField<String>("No devices found. Please click add button to add devices.");
    public final ObservableList<Device> devices = new ObservableArrayList<Device>();

    //Tag
    public static final String TAG = DeviceListViewModel.class.getName();

    public void loadDeviceList(){
        DeviceRemoteDataSource.getInstance().loadDeviceList(new Callback<List<Device>>() {
            @MainThread
            @Override
            public void onResponse(Call<List<Device>> call, Response<List<Device>> response) {
                devices.clear();
                devices.addAll(response.body());
            }
            @MainThread
            @Override
            public void onFailure(Call<List<Device>> call, Throwable t) {

            }
        });
    }
   /**
     * Provision to add a new device
     */
    public void addNewDevice(){
        loadDeviceList();
    }

}
