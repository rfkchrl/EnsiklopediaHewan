package arisyrifki.app.ensiklopediahewan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import arisyrifki.app.ensiklopediahewan.Holder.ModelHewan;

/**
 * Created by rfkchrl on 1/5/2019.
 */

public class HewanDetail extends AppCompatActivity {
    TextView hewanTitle, hewanSubtitle;
    ImageView hewanImg;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_hewan);

        hewanTitle = (TextView) findViewById(R.id.hewan_title);
        hewanSubtitle = (TextView)findViewById(R.id.hewan_subtitle);
        hewanImg = (ImageView) findViewById(R.id.img_hewan);



        ModelHewan hewan = (ModelHewan) getIntent().getSerializableExtra("id_Hewan");

        hewanTitle.setText(hewan.getHewanTitle());
        hewanSubtitle.setText(hewan.getHewanSubtitle());
        hewanImg.setImageResource(hewan.getHewanImg());
    }
}
