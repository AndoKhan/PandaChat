package com.khan.pandachat.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.khan.pandachat.R;

public class ChatFragment extends BaseFragment {

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.action_fragment_chat_send:
                    String message = mMessage.getText().toString();
                    sendMessage(message);
                    break;
            }
        }
    };

    private EditText mMessage;


    public ChatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chat, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private void initView(View root) {
        mMessage = (EditText) root.findViewById(R.id.input_fragment_chat_message);
        root.findViewById(R.id.action_fragment_chat_send).setOnClickListener(mOnClickListener);
    }

    private void sendMessage(String message) {

    }
}
