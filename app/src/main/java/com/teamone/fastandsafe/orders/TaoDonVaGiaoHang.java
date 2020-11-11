package com.teamone.fastandsafe.orders;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.teamone.fastandsafe.R;

import java.util.ArrayList;
import java.util.List;

public class TaoDonVaGiaoHang extends AppCompatActivity {
Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tao_don_va_giao_hang);
        spinner = findViewById(R.id.spinerPhuongThucThanhToan);
        List<String> list = new ArrayList<>();
        list.add("Quẹt thẻ");
        list.add("COD");
        list.add("Chuyển khoản");
        list.add("Tiền mặt");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,list);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spinner.setAdapter(adapter);


    }
}