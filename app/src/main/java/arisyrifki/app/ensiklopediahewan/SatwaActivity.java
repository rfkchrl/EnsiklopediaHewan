package arisyrifki.app.ensiklopediahewan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import arisyrifki.app.ensiklopediahewan.Adapter.AdapterSatwa;
import arisyrifki.app.ensiklopediahewan.Model.ModelSatwa;

/**
 * Created by rfkchrl on 1/5/2019.
 */

public class SatwaActivity extends AppCompatActivity {

    public List<ModelSatwa> satwa = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satwa);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerSatwa);

        LinearLayoutManager linear = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linear);

        satwaColection();

        AdapterSatwa adapterSatwa = new AdapterSatwa(satwa);
        recyclerView.setAdapter(adapterSatwa);


    }

    private void satwaColection() {
        satwa.add(new ModelSatwa("Unta berpunuk dua ", "Terancam Punah || Populasi 600 di Cina, 350 di Mongolia"));
        satwa.add(new ModelSatwa("Unta berpunuk satu", "Punah || Dialam liar"));
        satwa.add(new ModelSatwa("Cheetah", "Terancam Punah || Populasi antara 7000 - 10.000"));
        satwa.add(new ModelSatwa("Gajah Asia", "Terancam Punah || Populasi 40.000 - 50.000"));
        satwa.add(new ModelSatwa("Gajah Afrika", "Hampir Terancam || Populasi 470.000 - 690.000"));
        satwa.add(new ModelSatwa("Gorilla Timue", "Terancam Punah || Populasi kurang dari 700"));
        satwa.add(new ModelSatwa("Gorilla Barat", "Terancam Punah || Populasi 90.000"));
        satwa.add(new ModelSatwa("Gorilla Sungai Silang", "Sangat Terancam Punah || Populasi kurang dari 300"));
        satwa.add(new ModelSatwa("Amur Leopard", "Sangat Terancam Punah || Populasi kurang dari 40 "));
        satwa.add(new ModelSatwa("Snow Leopard", "Terancam Punah || Populasi 4.000 - 6.600"));
        satwa.add(new ModelSatwa("Singa Afrika", "Rentan Terancam || Populasi 30.000 - 50.000"));
        satwa.add(new ModelSatwa("Singa Asia", "Terancam Punah || Populasi 350"));
        satwa.add(new ModelSatwa("OrangUtan Sumatera", "Terancam Punah || Populasi 7.000"));
        satwa.add(new ModelSatwa("OrangUtan Kalimantan", "Terancam Punah || Populasi 40.000 - 65.000"));
        satwa.add(new ModelSatwa("Badak Putih", "Hampir Terancam || Populasi 17.000"));
        satwa.add(new ModelSatwa("Badak Hitam", "Terancam Punah || Populasi 3.500"));
        satwa.add(new ModelSatwa("Badak India", "Terancam Punah || Populasi 2.500"));
        satwa.add(new ModelSatwa("Badak Sumatera", "Terancam Punah || Populasi 300"));
        satwa.add(new ModelSatwa("Badak Asia", "Sangat Terancam Punah || Populasi 60"));
        satwa.add(new ModelSatwa("Harimau Bengal", "Terancam Punah || Populasi 2.000"));
        satwa.add(new ModelSatwa("Harimau Indochinese", "Terancam Punah || Populasi 500"));
        satwa.add(new ModelSatwa("Harimau Melayu", "Terancam Punah || Populasi 500"));
        satwa.add(new ModelSatwa("Harimau Sumatera", "Terancam Punah || Populasi 500"));
        satwa.add(new ModelSatwa("Harimau Siberia", "Terancam Punah || POpulasi 500"));
        satwa.add(new ModelSatwa("Harimau Cina Selatan", "Terancam Punah"));
        satwa.add(new ModelSatwa("Paus Biru", "Terancam Punah || Populsi 10.000 - 25.000"));
        satwa.add(new ModelSatwa("Paus Kanan Utara", "Terancam Punah || Populasi 350"));
        satwa.add(new ModelSatwa("Paus Kanan Pasifik Utara", "Terancam Punah || Populasi 1.000"));
        satwa.add(new ModelSatwa("Paus Sperma", "Rentan || Populasi 400.000 - 1.000.000"));
        satwa.add(new ModelSatwa("Paus Beluga", "Terancam Punah || Populasi 150.000"));
        satwa.add(new ModelSatwa("Grey Wolf", "Terancam || Populasi 1.600"));
        satwa.add(new ModelSatwa("Red Wolf", "Sangat Terancam Punah || Populasi 100"));
        satwa.add(new ModelSatwa("Grevy Zebra", "Terancam Punah || Populasi 2.000"));
        satwa.add(new ModelSatwa("Mountain Zebra", "Rentan || Populasi 1.500"));







    }
}
