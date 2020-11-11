package com.teamone.fastandsafe.orders;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.teamone.fastandsafe.R;
import com.teamone.fastandsafe.orders.QuanLyGiaoHang;
import com.teamone.fastandsafe.orders.TaoDonVaGiaoHang;

public class OrdersFragment extends Fragment {
    LinearLayout linearLayout1,linearLayout2,linearLayout3,linearLayout4;
    Intent intent;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_orders,container,false);
        linearLayout1 = (LinearLayout) view.findViewById(R.id.LnTaoDon);
        linearLayout2 = (LinearLayout) view.findViewById(R.id.LnDanhSachDon);
        linearLayout3 = (LinearLayout) view.findViewById(R.id.LnKhachHangTra);
        linearLayout4 = (LinearLayout) view.findViewById(R.id.LnQuanLyGiaoHang);

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getActivity().getApplication(), TaoDonVaGiaoHang.class);
                startActivity(intent);
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                intent = new Intent(getActivity().getApplication(),DanhSachDonHang.class);
                startActivity(intent);
            }
        });
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                intent = new Intent(getActivity().getApplication(),KhachTraHang.class);
                startActivity(intent);
            }
        });
        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getActivity().getApplication(), QuanLyGiaoHang.class);
                startActivity(intent);
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);





    }
}