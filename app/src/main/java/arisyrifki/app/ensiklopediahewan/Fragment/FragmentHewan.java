package arisyrifki.app.ensiklopediahewan.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import arisyrifki.app.ensiklopediahewan.FunActivity;
import arisyrifki.app.ensiklopediahewan.HewanActivity;
import arisyrifki.app.ensiklopediahewan.R;
import arisyrifki.app.ensiklopediahewan.SatwaActivity;

/**
 * Created by rfkchrl on 1/5/2019.
 * Fragment 1 / fragment Hewan
 */

public class FragmentHewan extends Fragment {

    private Button btnhewan;
    private Button btnsatwa;
    private Button btnfun;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_layout_btn,container,false);



        btnhewan = (Button) view.findViewById(R.id.btn_hewan);
        btnsatwa = (Button) view.findViewById(R.id.btn_satwa);
        btnfun = (Button) view.findViewById(R.id.btn_fun);




        btnhewan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenthewan = new Intent(getActivity(), HewanActivity.class);
                startActivity(intenthewan);
            }
        });
        btnsatwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentsatwa = new Intent(getActivity(), SatwaActivity.class);
                startActivity(intentsatwa);
            }
        });
        btnfun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentsatwa = new Intent(getActivity(), FunActivity.class);
                startActivity(intentsatwa);

            }
        });

        return view;
    }

}
