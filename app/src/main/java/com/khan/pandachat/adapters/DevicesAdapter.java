package com.khan.pandachat.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.khan.pandachat.R;
import com.khan.pandachat.modul.Device;

import java.util.ArrayList;
import java.util.List;

public class DevicesAdapter extends BaseAdapter{

    private List<Device> mDevices;
    private LayoutInflater mInflater;

    public DevicesAdapter(Context context, List<Device> devices) {
        mDevices = devices;
        mInflater = LayoutInflater.from(context);
    }

    public DevicesAdapter(Context context) {
        mDevices = new ArrayList<>();
        mInflater = LayoutInflater.from(context);
    }

    public void updateDevices(List<Device> devices) {
        mDevices.clear();
        mDevices.addAll(devices);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mDevices.size();
    }

    @Override
    public Device getItem(int position) {
        return mDevices.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = mInflater.inflate(R.layout.item_device, null, false);
            holder.name = (TextView) view.findViewById(R.id.label_item_device_name);
            holder.address = (TextView) view.findViewById(R.id.label_item_device_address);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        Device device = mDevices.get(position);
        holder.name.setText(device.getName());
        holder.address.setText(device.getAddress());

        return view;
    }

    class ViewHolder {
        TextView name;
        TextView address;
    }
}
