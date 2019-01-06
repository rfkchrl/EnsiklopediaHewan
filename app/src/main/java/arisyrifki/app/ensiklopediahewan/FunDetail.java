package arisyrifki.app.ensiklopediahewan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import arisyrifki.app.ensiklopediahewan.Model.ModelFun;

/**
 * Created by rfkchrl on 1/5/2019.
 */

public class FunDetail extends AppCompatActivity {
    TextView funTitle, funSubtitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_fun);

        //funTitle = (TextView) findViewById(R.id.fun_title);
        funSubtitle = (TextView)findViewById(R.id.fun_subtitle);

        ModelFun fun = (ModelFun) getIntent().getSerializableExtra("id_Fun");

//        funTitle.setText(fun.getFunTitle());
        funSubtitle.setText(fun.getFunSubtitle());
    }
}
