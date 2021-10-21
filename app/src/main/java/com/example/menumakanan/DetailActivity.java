package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    String nama="";
    String harga="";
    String deskripsi="";
    String gambar="";

    TextView tvNama;
    TextView hargadetail;
    TextView deskripsidetail;
    ImageView gambardetail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            nama = bundle.getString("nama");
            harga = bundle.getString("harga");
            deskripsi = bundle.getString("deskripsi");
            gambar = bundle.get("gambar");

        }
        tvNama = findViewById(R.id.tv_nama);
        tvNama.setText(nama);

        hargadetail = findViewById(R.id.hargadetail);
        hargadetail.setText(harga);

        deskripsidetail = findViewById(R.id.deskripsidetail);
        deskripsidetail.setText(deskripsi);

        gambardetail = findViewById(R.id.gambardetail);
        gambardetail.setImageResource(gambar);


//        Log.d(">>>nama", nama);

    }

}