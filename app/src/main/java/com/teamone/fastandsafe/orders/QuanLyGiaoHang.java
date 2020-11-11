package com.teamone.fastandsafe.orders;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.teamone.fastandsafe.R;

public class QuanLyGiaoHang extends AppCompatActivity {
ListView listViewQLGH;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quan_ly_giao_hang);
        listViewQLGH = findViewById(R.id.lvQuanLyGiaoHang);
//        listViewQLGH.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
    }
}