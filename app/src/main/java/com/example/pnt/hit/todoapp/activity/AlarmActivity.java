package com.example.pnt.hit.todoapp.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pnt.hit.todoapp.databinding.ActivityAlarmBinding;

public class AlarmActivity extends AppCompatActivity {
    private ActivityAlarmBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAlarmBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}