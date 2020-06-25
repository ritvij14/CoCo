package com.example.myapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.myapplication.databinding.ActivityAskPermissionsBinding;

public class AskPermissions extends AppCompatActivity {

    ActivityAskPermissionsBinding permissionsBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setting up view binder
        permissionsBinding = ActivityAskPermissionsBinding.inflate(getLayoutInflater());
        View view = permissionsBinding.getRoot();
        setContentView(view);


    }
}