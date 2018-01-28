package com.jnj.devicemanager.devicelist;

import android.content.Context;

/**
 * Interface bridge between view and view model
 */

public interface DeviceListViewModelBridge {
    /**
     * Add a new device
     */
    void showAddDeviceScreen();

    /**
     * Get the view's context
     * @return
     */
    Context getViewContext();
}
