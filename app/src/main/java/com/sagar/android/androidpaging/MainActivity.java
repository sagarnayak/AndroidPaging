package com.sagar.android.androidpaging;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sagar.android.androidpaging.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @SuppressWarnings("FieldCanBeLocal")
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        setSupportActionBar(activityMainBinding.toolbar);
    }
}
