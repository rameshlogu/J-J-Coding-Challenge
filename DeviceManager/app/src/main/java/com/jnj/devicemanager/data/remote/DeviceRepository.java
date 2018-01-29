package com.jnj.devicemanager.data.remote;

import com.jnj.devicemanager.data.Device;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Remote repository for devices
 */

public interface DeviceRepository {
    @GET("devices")
    Call<List<Device>> getDeviceList();
}
