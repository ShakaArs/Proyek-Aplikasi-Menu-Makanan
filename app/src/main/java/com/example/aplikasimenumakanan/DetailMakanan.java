package com.example.aplikasimenumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMakanan extends AppCompatActivity {

    public static final String TAG = "Test";
    protected TextView txtNama, txtDeskripsi, txtHarga;
    protected ImageView imgFotoMakanan;

    protected String nama, deskripsi, harga;
    protected int id_gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        txtNama = findViewById(R.id.txtNama);
        txtDeskripsi = findViewById(R.id.txtDeskripsi);
        txtHarga = findViewById(R.id.txtHarga);
        imgFotoMakanan = findViewById(R.id.imgFotoMakanan);

        Bundle bd = getIntent().getExtras();
        nama = bd.getString("nama");
        deskripsi = bd.getString("deskripsi");
        harga = bd.getString("harga");
        id_gambar = bd.getInt("id_gambar");

        Log.d(TAG, "Nama:" + id_gambar);

        txtNama.setText(nama);
        txtDeskripsi.setText(deskripsi);
        txtHarga.setText("Harga:    Rp" + harga);
        imgFotoMakanan.setImageResource(id_gambar);
    }
}