package com.teamone.fastandsafe.add;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.teamone.fastandsafe.R;

public class ChucNangKhacActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang_khac);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}