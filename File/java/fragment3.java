package com.hallo;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragment3 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment3, null);

        ImageView btnPengabdi = view.findViewById(R.id.btnPengabdi);
        ImageView btnPocong = view.findViewById(R.id.btnPocong);
        ImageView btnJailangkung = view.findViewById(R.id.btnJailangkung);
        ImageView btnKkn = view.findViewById(R.id.btnKkn);
        ImageView btnSewudino = view.findViewById(R.id.btnSewudino);
        ImageView btnPerjanjian = view.findViewById(R.id.btnPerjanjian);



        btnPengabdi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Pengabdi", R.drawable.horor1, R.string.sinopsis_horor1);
            }
        });
        btnPocong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Pocong", R.drawable.horor2, R.string.sinopsis_horor2);
            }
        });
        btnJailangkung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Jailangkung", R.drawable.horor3, R.string.sinopsis_horor3);
            }
        });
        btnKkn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Kkn", R.drawable.horor4, R.string.sinopsis_horor4);
            }
        });
        btnSewudino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Sewudino", R.drawable.horor6, R.string.sinopsis_horor5);
            }
        });
        btnPerjanjian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Perjanjian", R.drawable.horor7, R.string.sinopsis_horor6);
            }
        });

        return view;
    }
    private void startSinopsisActivity(String title, int imageResId, int textResId) {
        Intent intent = new Intent(getActivity(), FragmentSynopsis.class);
        intent.putExtra("title", title);
        intent.putExtra("imageResId", imageResId);
        intent.putExtra("textResId", textResId);
        startActivity(intent);

    }
}

