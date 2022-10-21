package com.example.aplikasimenumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recKuliner;
    private ArrayList<MakananKuliner> listKuliner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recKuliner = findViewById(R.id.rec_Makanan);
        initData();

        recKuliner.setAdapter(new AdapterMakanan(listKuliner));
        recKuliner.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData() {
        this.listKuliner = new ArrayList<>();
        //Jika ingin menggunakan database
        // Koneksi DB
        // Query
        // Iterasi hasil query ke arraylist
        listKuliner.add(new MakananKuliner("Tahu Aci",
                "2.500",
                "Tahu aci adalah cemilan yang sangat nikmat jika disajikan bersama teh botol sosro",
                R.drawable.tahuaci));

        listKuliner.add(new MakananKuliner("Kupat Blengong",
                "15.000",
                "Makanan yang terbuat dari daging hewan blengong adalah salah satu makanan khas Brebes",
                R.drawable.blengong));

        listKuliner.add(new MakananKuliner("Telur Asin",
                "7.000",
                "Telur yang berbeda daripad telur-telu Biasanya, dan memiliki cita rasa yang khas",
                R.drawable.telurasin));

        listKuliner.add(new MakananKuliner("Belut Goreng",
                "35.000",
                "Belut diolah dengan spesial dan disajikan untuk bisa disantap bersama sambal , beeeeh :)",
                R.drawable.belutgoreng));

        listKuliner.add(new MakananKuliner("Nasi Lengko",
                "15.000",
                "Nasi campur yang dihidangkan bersama potongan tahu,tempe dan sayuran dan dilumuri oleh sambal kacang dan kecap",
                R.drawable.nasilengko));

        listKuliner.add(new MakananKuliner("Olos",
                "1.000",
                "gorengan yang terbuat dari tepung dan berbentuk bulat seperti bola, berisikan kembang kol, bawang dan cabai rawit",
                R.drawable.olos));
    }
}