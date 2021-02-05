package com.example.homework6;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HideAndShowFragment extends Fragment {
    private Button btnHide, btnShow;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hide_and_show, container, false);
        btnHide = view.findViewById(R.id.hide);
        btnShow = view.findViewById(R.id.show);
        btnHide.setOnClickListener(v -> {
            MainActivity mainActivity = (MainActivity) getActivity();
            mainActivity.onHide();
        });
        btnShow.setOnClickListener(v -> {
            MainActivity mainActivity = (MainActivity) getActivity();
            mainActivity.onShow();
        });
        return view;
    }
}