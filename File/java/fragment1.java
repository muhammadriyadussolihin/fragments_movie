package com.hallo;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragment1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment1, null);

        ImageView btnSerigala = view.findViewById(R.id.btnSerigala);
        ImageView btnPertaruhan = view.findViewById(R.id.btnPertaruhan);
        ImageView btnTheraid = view.findViewById(R.id.btnTheraid);
        ImageView btnBom = view.findViewById(R.id.btnBom);
        ImageView btnWiro = view.findViewById(R.id.btnWiro);

        btnSerigala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Serigala", R.drawable.serigala, R.string.synopsis_serigala);
            }
        });
        btnPertaruhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Pertaruhan", R.drawable.pertaruhan, R.string.sinopsis_pertaruhan);
            }
        });
        btnTheraid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("theraid", R.drawable.theraid, R.string.sinopsis_theraid);
            }
        });
        btnBom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("bom", R.drawable.bom, R.string.sinopsis_bom);
            }
        });
        btnWiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("wiro", R.drawable.wiro, R.string.sinopsis_wiro);
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
