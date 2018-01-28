package com.jnj.devicemanager.util;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by rl113 on 1/26/18.
 */

public class ViewModelHolder<T> extends Fragment {
    private T mViewModel;

    public static <T> ViewModelHolder createViewModelHolder(T viewModel){
        ViewModelHolder<T> vmViewModelHolder = new ViewModelHolder<T>();
        vmViewModelHolder.setViewModel(viewModel);
        return vmViewModelHolder;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    public void setViewModel(T viewModel) {
        this.mViewModel = viewModel;
    }

    public T getViewModel() {
        return mViewModel;
    }
}
