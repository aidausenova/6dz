package com.example.homework6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements IFragments {

    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = findViewById(R.id.fragment_second);

    }

    @Override
    public void onSendText(String text) {
        fragmentManager = getSupportFragmentManager();
        TExtFragment fragment = (TExtFragment) fragmentManager.findFragmentById(R.id.fragment_second);
        transaction = fragmentManager.beginTransaction();
        fragment.showText(text);
        transaction.commit();
    }

    @Override
    public void onHide() {
        linearLayout.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onShow() {
        linearLayout.setVisibility(View.VISIBLE);
    }
}