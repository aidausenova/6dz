package com.example.homework6;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class TExtFragment extends Fragment {
    private RecyclerView recyclerView;
    private List<MainModel> list;
    private ListAdapter adapter;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle s) {
        super.onViewCreated(view, s);
        recyclerView = view.findViewById(R.id.r_w);
        list = new ArrayList<>();
        adapter = new ListAdapter(list, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_t_ext, container, false);
    }

    public void showText(String text) {
        list.add(new MainModel(text));
        adapter.notifyDataSetChanged();
        System.out.printf("");
    }
}