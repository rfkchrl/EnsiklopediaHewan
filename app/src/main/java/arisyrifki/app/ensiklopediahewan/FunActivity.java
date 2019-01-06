package arisyrifki.app.ensiklopediahewan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import arisyrifki.app.ensiklopediahewan.Adapter.AdapterFun;
import arisyrifki.app.ensiklopediahewan.Model.ModelFun;

/**
 * Created by rfkchrl on 1/5/2019.
 */

public class FunActivity extends AppCompatActivity {

    public List<ModelFun> fun = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerFun);

        LinearLayoutManager linear = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linear);

        funColection();

        AdapterFun adapterFun = new AdapterFun(fun);
        recyclerView.setAdapter(adapterFun);


    }

    private void funColection() {
        fun.add(new ModelFun("Fakta Burung Albatros",
                "Telur Albatros menetas dalam waktu 80 hari,  lebih lama daripada burung lainnya. " +
                        " Albatros juga mencari makan dilaut, makanannya adalah cumi-cumi." +
                        " Albatros bisa terbang sejauh 800 km hanya dalam 12 jam !"));

        fun.add(new ModelFun("Fakta Buaya",
                "Buaya sudah ada dibumi semlama lebih 200 juta tahun. lho !" +
                        " Buaya dapat mencapai panjang tubuh sekitar 6 Meter !"));

        fun.add(new ModelFun("Fakta Armadillo",
                "Walaupun mempunyai pelindung tubuh yang sangat berat, Armadillo pandai berenang lho !"));

        fun.add(new ModelFun("Fakta Baboon",
                "Baboon jantan lebih besar 2x daripad baboon betina." +
                        " Kalau ketakutan Baboon menggonggong seperti anjing."));

        fun.add(new ModelFun("Fakta Berang-Berang",
                "Bendungan yang dibuat berang-berang bisa mencapaipanjang 500m dan tinggi 4m !" +
                        " Ada beberapa bendungan yang dibuat oleh berang-berang yang berumur 1000 tahun lho !"));

        fun.add(new ModelFun("Fakta Bison",
                "Bison sekarang bertahan hidup dalam kelompok yang dilindungi." +
                        " Pemburu telah membunuh bison sampai tinggal 1000 ekor :("));

        fun.add(new ModelFun("Fakta Chameleon",
                "Chameleon hidup di pohon, namun bertelur ditanah." +
                        " Chameleon dapat mengubah warna kulitnya untuk bersembunyi."));

        fun.add(new ModelFun("Fakta Cheetah",
                "Cheeta adalah satu-satunya kucing yang tidak dapat memasukan cakarnya, ini disebabkan kegunaan cakarnya untuk mencengkram" +
                        " tanah saat berlari." +
                        " Cheetah panjangnya 1.4m dan panjang ekornya 80cm"));

        fun.add(new ModelFun("Hewan Buah ? ",
                "Tahukah Kau ?! Kiwi juga merupakan nama buah yang banyak ditanam di Selandia Baru. " +
                        " Nama buah ini diambil dari nama burung kiwi yang lucu, yang kemudian dijadikan " +
                        " simbil nasiional negara Selandia Baru !"));

        fun.add(new ModelFun("Fakta Kolibri",
                "Kolibri leher merah delima terbang 800km non-stop menyebrangi teluk Mexico untuk migrasi." +
                        " Kolibri biasanya hanya bertelur 2 butir, telur terkecil dibandingan telur burung lain !"));
    }
}

