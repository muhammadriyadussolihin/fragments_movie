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

public class fragment2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment2, null);

        ImageView btnSriasih = view.findViewById(R.id.btnSriasih);
        ImageView btnStarwars = view.findViewById(R.id.btnStarwars);
        ImageView btnSpiderman = view.findViewById(R.id.btnSpiderman);
        ImageView btnFilmrizki= view.findViewById(R.id.btnFilmrizki);
        ImageView btnAvengers= view.findViewById(R.id.btnAvengers);
        ImageView btnDoctor= view.findViewById(R.id.btnDoctor);

        btnSriasih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Sriasih", R.drawable.film1, R.string.sinopsis_film1);
            }
        });

        btnStarwars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Starwars", R.drawable.film2, R.string.sinopsis_film2);
            }
        });
        btnSpiderman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Spiderman", R.drawable.film3, R.string.sinopsis_film3);
            }
        });
        btnFilmrizki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Mazerunner", R.drawable.film5, R.string.sinopsis_film4);
            }
        });
        btnAvengers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Avengers", R.drawable.film7, R.string.sinopsis_film5);
            }
        });
        btnDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Doctor", R.drawable.film8, R.string.sinopsis_film6);
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
