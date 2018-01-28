package com.jnj.devicemanager.devicelist.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.jnj.devicemanager.data.Device;
import com.jnj.devicemanager.databinding.DeviceItemBinding;

import java.util.List;

/**
 * List adapter for the devices
 */

public class DeviceListAdapter extends RecyclerView.Adapter<DeviceListAdapter.DeviceViewHolder>{

    private List<Device> mListItems;

    /**
     * Constructor
     * @param deviceList the list data
     */
    public DeviceListAdapter(List<Device> deviceList) {
        setData(deviceList);
    }

    @Override
    public DeviceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Create the view holder
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        DeviceItemBinding binding = DeviceItemBinding.inflate(inflater,parent,false);
        return new DeviceViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(DeviceViewHolder holder, int position) {
        //Provide binding
        DeviceListItemViewModel deviceListItemViewModel = new DeviceListItemViewModel();
        holder.getItemBinding().setDeviceItemViewModel(deviceListItemViewModel);
        deviceListItemViewModel.setDevice(mListItems.get(position));
    }

    @Override
    public int getItemCount() {
        return mListItems != null ? mListItems.size() : 0;
    }

    /**
     * Set the data
     * @param deviceList the device list
     */
    public void setData(List<Device> deviceList){
        mListItems = deviceList;
        notifyDataSetChanged();
    }

    /**
     * View holder for device item
     */
    public class DeviceViewHolder extends RecyclerView.ViewHolder {
        private DeviceItemBinding itemBinding;

        /**
         * Constructor
         * @param binding the binding object
         */
        public DeviceViewHolder(DeviceItemBinding binding) {
            super(binding.getRoot());
            setItemBinding(binding);
        }

        public DeviceItemBinding getItemBinding() {
            return itemBinding;
        }

        public void setItemBinding(DeviceItemBinding itemBinding) {
            this.itemBinding = itemBinding;
        }
    }
}
