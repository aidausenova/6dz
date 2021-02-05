package com.example.homework6;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class ChangeFragment extends Fragment {
    private EditText editText;
    private Button btnSend;
    private IFragments iFragments;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        iFragments = (IFragments) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_change, container, false);
        editText = view.findViewById(R.id.etText);
        btnSend = view.findViewById(R.id.btnSend);
        btnSend.setOnClickListener(v -> {
            String text = editText.getText().toString();
            MainActivity mainActivity = (MainActivity) getActivity();
            if (mainActivity != null) {
                mainActivity.onSendText(text);

            }
        });
        return view;
    }
}