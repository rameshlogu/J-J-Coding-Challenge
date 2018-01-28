package com.jnj.devicemanager.devicelist;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jnj.devicemanager.databinding.DeviceListBinding;
import com.jnj.devicemanager.util.FragmentManagerUtil;
import com.jnj.devicemanager.util.ViewModelHolder;

/**
 * View to show/manage device list
 */

public class DeviceListFragment extends Fragment implements DeviceListViewModelBridge{
    private DeviceListBinding mListBinding;
    public static final String TAG = DeviceListFragment.class.getName();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        mListBinding = DeviceListBinding.inflate(inflater,container,false);
        //Set the view for binding
        mListBinding.setView(this);
        //Set the view model
        mListBinding.setViewmodel(getViewModel());
        return mListBinding.getRoot();
    }

    /**
     * Create the view model if it not available in the memory then return
     * @return the view model
     */
    private DeviceListViewModel getViewModel() {
        ViewModelHolder<DeviceListViewModel> modelHolder = (ViewModelHolder<DeviceListViewModel>)getFragmentManager().findFragmentByTag(DeviceListViewModel.class.getName());
        if(modelHolder == null) {
            modelHolder = ViewModelHolder.createViewModelHolder(new DeviceListViewModel());
            FragmentManagerUtil.addFragment(getFragmentManager(),modelHolder,DeviceListViewModel.TAG);
        }
        return modelHolder.getViewModel();
    }

    @Override
    public void showAddDeviceScreen() {
        //TO-DO: show add device screen
    }

    @Override
    public Context getViewContext() {
        return getActivity().getBaseContext();
    }
}

