package com.teamone.fastandsafe.products;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.teamone.fastandsafe.R;
import com.teamone.fastandsafe.orders.DanhSachDonHang;
import com.teamone.fastandsafe.orders.KhachTraHang;
import com.teamone.fastandsafe.orders.QuanLyGiaoHang;
import com.teamone.fastandsafe.orders.TaoDonVaGiaoHang;


public class ProDuctFragment extends Fragment {
LinearLayout linearLayout1,linearLayout2,linearLayout3;
Intent intent;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pro_duct,container,false);
        linearLayout1 = (LinearLayout) view.findViewById(R.id.LnThemSanPham);
        linearLayout2 = (LinearLayout) view.findViewById(R.id.LnDanhSachSanPham);
        linearLayout3 = (LinearLayout) view.findViewById(R.id.LnKiemHang);
        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getActivity().getApplication(), ThemSanPham.class);
                startActivity(intent);
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getActivity().getApplication(), DanhSachSanPham.class);
                startActivity(intent);
            }
        });
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getActivity().getApplication(), QuanLySanPham.class);
                startActivity(intent);
            }
        });
        return view;
    }
}