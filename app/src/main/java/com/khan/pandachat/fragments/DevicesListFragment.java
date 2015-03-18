package com.khan.pandachat.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.khan.pandachat.Constants;
import com.khan.pandachat.R;
import com.khan.pandachat.adapters.DevicesAdapter;
import com.khan.pandachat.modul.Device;

import java.util.List;

public class DevicesListFragment extends BaseFragment {

    private AdapterView.OnItemClickListener mOnItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            mActivity.connectToDevice(mDevicesAdapter.getItem(position).getAddress());
        }
    };

    private DevicesAdapter mDevicesAdapter;

    public DevicesListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_devices_list, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initView(view);
    }

    private void initView(View root) {

        mDevicesAdapter = new DevicesAdapter(mActivity);

        ListView listView = (ListView) root.findViewById(R.id.list_fragment_devices);
        listView.setAdapter(mDevicesAdapter);
        listView.setOnItemClickListener(mOnItemClickListener);
    }

    public void updateDevices(List<Device> devices) {
        mDevicesAdapter.updateDevices(devices);
    }
}
