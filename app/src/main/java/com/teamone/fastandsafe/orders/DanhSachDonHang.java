package com.teamone.fastandsafe.orders;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.teamone.fastandsafe.R;

public class DanhSachDonHang extends AppCompatActivity {
ListView listViewDSDH;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danh_sach_don_hang);
        listViewDSDH = findViewById(R.id.lvDanhSachHoaDOon);
//        listViewDSDH.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
    }
}