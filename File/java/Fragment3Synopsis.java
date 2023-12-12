package com.hallo;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Fragment3Synopsis extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment3_synopsis);

        // Mendapatkan data dari Intent
        String title = getIntent().getStringExtra("title");
        int imageResId = getIntent().getIntExtra("imageResId", 0);
        int textResId = getIntent().getIntExtra("textResId", 0);

        // Mendapatkan referensi ke ImageView dan TextView untuk Sriasih
        ImageView sinopsisImageViewHoror1 = findViewById(R.id.Horor1sinopsis);
        TextView sinopsisTextViewHoror1 = findViewById(R.id.sinopsisHoror1);

        // Mendapatkan referensi ke ImageView dan TextView untuk Sriasih
        ImageView sinopsisImageViewHoror2 = findViewById(R.id.Horor2sinopsis);
        TextView sinopsisTextViewHoror2 = findViewById(R.id.sinopsisHoror2);

        // Mendapatkan referensi ke ImageView dan TextView untuk Sriasih
        ImageView sinopsisImageViewHoror3 = findViewById(R.id.Horor3sinopsis);
        TextView sinopsisTextViewHoror3 = findViewById(R.id.sinopsisHoror3);

        // Mendapatkan referensi ke ImageView dan TextView untuk Sriasih
        ImageView sinopsisImageViewHoror4 = findViewById(R.id.Horor4sinopsis);
        TextView sinopsisTextViewHoror4 = findViewById(R.id.sinopsisHoror4);

        // Mendapatkan referensi ke ImageView dan TextView untuk Sriasih
        ImageView sinopsisImageViewHoror5 = findViewById(R.id.Horor5sinopsis);
        TextView sinopsisTextViewHoror5 = findViewById(R.id.sinopsisHoror5);

        // Mendapatkan referensi ke ImageView dan TextView untuk Sriasih
        ImageView sinopsisImageViewHoror6 = findViewById(R.id.Horor6sinopsis);
        TextView sinopsisTextViewHoror6 = findViewById(R.id.sinopsisHoror6);





        // Menampilkan data sinopsis untuk Serigala
        sinopsisImageViewHoror1.setImageResource(imageResId);
        sinopsisTextViewHoror1.setText(textResId);

        // Menampilkan data sinopsis untuk Serigala
        sinopsisImageViewHoror2.setImageResource(imageResId);
        sinopsisTextViewHoror2.setText(textResId);

        // Menampilkan data sinopsis untuk Serigala
        sinopsisImageViewHoror3.setImageResource(imageResId);
        sinopsisTextViewHoror3.setText(textResId);

        // Menampilkan data sinopsis untuk Serigala
        sinopsisImageViewHoror4.setImageResource(imageResId);
        sinopsisTextViewHoror4.setText(textResId);

        // Menampilkan data sinopsis untuk Serigala
        sinopsisImageViewHoror5.setImageResource(imageResId);
        sinopsisTextViewHoror5.setText(textResId);

        // Menampilkan data sinopsis untuk Serigala
        sinopsisImageViewHoror6.setImageResource(imageResId);
        sinopsisTextViewHoror6.setText(textResId);







    }
}

