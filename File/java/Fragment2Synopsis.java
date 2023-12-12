package com.hallo;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Fragment2Synopsis extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment2_synopsis);

        // Mendapatkan data dari Intent
        String title = getIntent().getStringExtra("title");
        int imageResId = getIntent().getIntExtra("imageResId", 0);
        int textResId = getIntent().getIntExtra("textResId", 0);

        // Mendapatkan referensi ke ImageView dan TextView untuk Sriasih
        ImageView sinopsisImageViewFilm1 = findViewById(R.id.Film1sinopsis);
        TextView sinopsisTextViewFilm1 = findViewById(R.id.sinopsisFilm1);
        // Mendapatkan referensi ke ImageView dan TextView untuk Starwars
        ImageView sinopsisImageViewFilm2 = findViewById(R.id.Film2sinopsis);
        TextView sinopsisTextViewFilm2 = findViewById(R.id.sinopsisFilm2);
        // Mendapatkan referensi ke ImageView dan TextView untuk Theraid
        ImageView sinopsisImageViewFilm3 = findViewById(R.id.Film3sinopsis);
        TextView sinopsisTextViewFilm3 = findViewById(R.id.sinopsisFilm3);
        // Mendapatkan referensi ke ImageView dan TextView untuk Filmrizki
        ImageView sinopsisImageViewFilm4 = findViewById(R.id.Film4sinopsis);
        TextView sinopsisTextViewFilm4 = findViewById(R.id.sinopsisFilm4);
        // Mendapatkan referensi ke ImageView dan TextView untuk Avengers
        ImageView sinopsisImageViewFilm5 = findViewById(R.id.Film5sinopsis);
        TextView sinopsisTextViewFilm5 = findViewById(R.id.sinopsisFilm5);
        // Mendapatkan referensi ke ImageView dan TextView untuk Doctor
        ImageView sinopsisImageViewFilm6 = findViewById(R.id.Film6sinopsis);
        TextView sinopsisTextViewFilm6 = findViewById(R.id.sinopsisFilm6);



        // Menampilkan data sinopsis untuk Serigala
        sinopsisImageViewFilm1.setImageResource(imageResId);
        sinopsisTextViewFilm1.setText(textResId);

        // Menampilkan data sinopsis untuk Pertaruhan
        sinopsisImageViewFilm2.setImageResource(imageResId);
        sinopsisTextViewFilm2.setText(textResId);

        // Menampilkan data sinopsis untuk Theraid
        sinopsisImageViewFilm3.setImageResource(imageResId);
        sinopsisTextViewFilm3.setText(textResId);

        // Menampilkan data sinopsis untuk Bom
        sinopsisImageViewFilm4.setImageResource(imageResId);
        sinopsisTextViewFilm4.setText(textResId);

        // Menampilkan data sinopsis untuk Bom
        sinopsisImageViewFilm5.setImageResource(imageResId);
        sinopsisTextViewFilm5.setText(textResId);

        // Menampilkan data sinopsis untuk Bom
        sinopsisImageViewFilm6.setImageResource(imageResId);
        sinopsisTextViewFilm6.setText(textResId);




    }
}

