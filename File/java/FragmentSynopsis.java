package com.hallo;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FragmentSynopsis extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_synopsis);

        // Mendapatkan data dari Intent
        String title = getIntent().getStringExtra("title");
        int imageResId = getIntent().getIntExtra("imageResId", 0);
        int textResId = getIntent().getIntExtra("textResId", 0);

        // Mendapatkan referensi ke ImageView dan TextView untuk Serigala
        ImageView sinopsisImageViewSerigala = findViewById(R.id.Serigalasinopsis);
        TextView sinopsisTextViewSerigala = findViewById(R.id.sinopsisSerigala);
        // Mendapatkan referensi ke ImageView dan TextView untuk Pertaruhan
        ImageView sinopsisImageViewPertaruhan = findViewById(R.id.Pertaruhansinopsis);
        TextView sinopsisTextViewPertaruhan = findViewById(R.id.sinopsisPertaruhan);
        // Mendapatkan referensi ke ImageView dan TextView untuk Theraid
        ImageView sinopsisImageViewTheraid = findViewById(R.id.Theraidsinopsis);
        TextView sinopsisTextViewTheraid = findViewById(R.id.sinopsisTheraid);
        // Mendapatkan referensi ke ImageView dan TextView untuk Bom
        ImageView sinopsisImageViewBom = findViewById(R.id.Bomsinopsis);
        TextView sinopsisTextViewBom = findViewById(R.id.sinopsisBom);
        // Mendapatkan referensi ke ImageView dan TextView untuk Wiro
        ImageView sinopsisImageViewWiro = findViewById(R.id.Wirosinopsis);
        TextView sinopsisTextViewWiro = findViewById(R.id.sinopsisWiro);



        // Menampilkan data sinopsis untuk Serigala
        sinopsisImageViewSerigala.setImageResource(imageResId);
        sinopsisTextViewSerigala.setText(textResId);

        // Menampilkan data sinopsis untuk Pertaruhan
        sinopsisImageViewPertaruhan.setImageResource(imageResId);
        sinopsisTextViewPertaruhan.setText(textResId);

        // Menampilkan data sinopsis untuk Theraid
        sinopsisImageViewTheraid.setImageResource(imageResId);
        sinopsisTextViewTheraid.setText(textResId);

        // Menampilkan data sinopsis untuk Bom
        sinopsisImageViewBom.setImageResource(imageResId);
        sinopsisTextViewBom.setText(textResId);

        // Menampilkan data sinopsis untuk Bom
        sinopsisImageViewWiro.setImageResource(imageResId);
        sinopsisTextViewWiro.setText(textResId);



    }
}

