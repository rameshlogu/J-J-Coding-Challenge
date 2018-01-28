package com.jnj.devicemanager.devicelist.adapter;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;

import com.jnj.devicemanager.data.Device;

import java.util.List;

/**
 * Custom binding for the recycler view
 */

public class DeviceListBinding {
    @BindingAdapter("app:items")
    public static void setItems(RecyclerView recyclerView, List<Device> items) {
        ((DeviceListAdapter)recyclerView.getAdapter()).setData(items);
    }
}
