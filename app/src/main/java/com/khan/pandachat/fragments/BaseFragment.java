package com.khan.pandachat.fragments;

import android.app.Activity;
import android.app.Fragment;

public class BaseFragment extends Fragment {

    protected Activity mActivity;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        mActivity = activity;
    }
}
