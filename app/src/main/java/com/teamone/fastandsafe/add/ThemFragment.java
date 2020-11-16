package com.teamone.fastandsafe.add;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.teamone.fastandsafe.R;

public class ThemFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_them,container,false);
        view.findViewById(R.id.user).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), UserActivity.class));
            }
        });
        view.findViewById(R.id.khachHang).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), CustomerActivity.class));
            }
        });
        view.findViewById(R.id.baocao).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),ChucNangKhacActivity.class));
            }
        });
        view.findViewById(R.id.soQuy).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),ChucNangKhacActivity.class));
            }
        });
        view.findViewById(R.id.thongBao).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),ChucNangKhacActivity.class));
            }
        });
        view.findViewById(R.id.uuDai).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),ChucNangKhacActivity.class));
            }
        });
        view.findViewById(R.id.cauHinh).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),ChucNangKhacActivity.class));
            }
        });
        view.findViewById(R.id.hoTro).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),ChucNangKhacActivity.class));
            }
        });
        return view;
    }
}