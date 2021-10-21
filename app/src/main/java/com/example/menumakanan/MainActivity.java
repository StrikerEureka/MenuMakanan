package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recMakanan;
    private ArrayList<Makanan> listmakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recMakanan = findViewById(R.id.rec_makanan);
        initData();

        recMakanan.setAdapter(new MakananAdapter(listmakanan));
        recMakanan.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData(){
        this.listmakanan = new ArrayList<>();
        listmakanan.add(new Makanan("Pecel Lele",
                "15.000",
                "Pecel lele goreng dong",
                R.drawable.pecel_lele));

        listmakanan.add(new Makanan("Nasi Goreng Mercon",
                "14.500",
                "Nasi goreng pedes dong",
                R.drawable.nasi_goreng));

        listmakanan.add(new Makanan("Ayam Geprek Keju",
                "20.000",
                "Ayam di geprek terus dikejuin dong",
                R.drawable.ayam_geprek));

        listmakanan.add(new Makanan("Kari Ayam",
                "17.500",
                "Ayam di kari-in dong",
                R.drawable.ayam_geprek));

        listmakanan.add(new Makanan("Tahu Bulat",
                "500",
                "Tahu bulat di goreng dadakan",
                R.drawable.ayam_geprek));

        listmakanan.add(new Makanan("Salad Buah",
                "12.000",
                "Buah dibikin salad dong",
                R.drawable.ayam_geprek));
    }
}