package com.jnj.devicemanager.data.remote;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jnj.devicemanager.data.Device;

import java.util.List;

import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Remote data source for devices
 */

public class DeviceRemoteDataSource {
    public static final String BASE_URL = "http://private-1cc0f-devicecheckout.apiary-mock.com/";
    private static DeviceRemoteDataSource sInstance;
    private DeviceRepository deviceRepository;

    /**
     * Private Constructor for SingleTon
     */
    private DeviceRemoteDataSource(){
        Gson gson = new GsonBuilder().setLenient().create();
        Retrofit httpClient = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        deviceRepository = httpClient.create(DeviceRepository.class);
    }

    /**
     * Get the SingleTon instance of this class
     * @return
     */
    public static DeviceRemoteDataSource getInstance(){
        if(sInstance == null) {
            sInstance = new DeviceRemoteDataSource();
        }
        return sInstance;
    }

    /**
     * Load the list of devices
     * @param callback the callback to get the response
     */
    public void loadDeviceList(Callback<List<Device>> callback){
        deviceRepository.getDeviceList().enqueue(callback);
    }
}
