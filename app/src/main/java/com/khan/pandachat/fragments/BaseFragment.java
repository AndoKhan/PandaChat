package com.khan.pandachat.fragments;

import android.app.Activity;
import android.app.Fragment;

import com.khan.pandachat.activities.MainActivity;

public class BaseFragment extends Fragment {

    protected MainActivity mActivity;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        mActivity = (MainActivity)activity;
    }
}
