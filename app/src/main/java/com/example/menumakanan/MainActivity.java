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
                "Ikan lele segar yang digoreng dengan tepung berkualitas hingga crispy disajikan dengan sambal yang menggugah selera.",
                R.drawable.pecel_lele));

        listmakanan.add(new Makanan("Nasi Goreng Mercon",
                "14.500",
                "Perpaduan antara nasi, sayuran, topping, dan cabai pilihan yang di olah bersama dan menghasilkan nasi goreng mercon yang mantap. ",
                R.drawable.nasi_goreng));

        listmakanan.add(new Makanan("Ayam Geprek Keju",
                "20.000",
                "Ayam goreng crispy yang di geprek dan disiram dengan saus keju mozarella yang lumer dan nikmat.",
                R.drawable.ayam_geprek));

        listmakanan.add(new Makanan("Kari Ayam",
                "17.500",
                "Sup kari ayam yang di olah dengan bumbu tradisional berkualtias yang menghasilkan aroma dan rasa yang nikmat.",
                R.drawable.kari_ayam));

        listmakanan.add(new Makanan("Tahu Bulat",
                "500",
                "Tahu bulat premium yang di goreng dadakan tapi tidak di atas mobil bak terbuka.",
                R.drawable.tahu_bulat));

        listmakanan.add(new Makanan("Salad Buah",
                "12.000",
                "Campuran buah-buahan berkualitas yang disajikan dengan sirup manis dan disajikan saat dingin.",
                R.drawable.salad_buah));
    }
}