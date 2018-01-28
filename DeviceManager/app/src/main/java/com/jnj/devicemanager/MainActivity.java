package com.jnj.devicemanager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.jnj.devicemanager.devicelist.DeviceListFragment;
import com.jnj.devicemanager.util.FragmentManagerUtil;

/**
 * This is an entry point of the application. This activity holds all fragments. The tool bar will be maintained here.
 */
public class MainActivity extends AppCompatActivity {

    //==============================================================================================
    // Activity life cycle methods
    //==============================================================================================
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //launch the device list
        lauchDeviceList();
    }

    private void lauchDeviceList(){
        //launch device list fragment if it is not there already
        if(getFragmentManager().findFragmentById(R.id.content_frame) == null) {
            FragmentManagerUtil.addFragment(getFragmentManager(), DeviceListFragment.instantiate(getBaseContext(),DeviceListFragment.TAG),R.id.content_frame);
        }
    }

}
