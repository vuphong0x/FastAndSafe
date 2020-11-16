package com.teamone.fastandsafe.add;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.teamone.fastandsafe.R;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        findViewById(R.id.btnChangePass).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserActivity.this,ChangePasswordActivity.class));
            }
        });
    }
}