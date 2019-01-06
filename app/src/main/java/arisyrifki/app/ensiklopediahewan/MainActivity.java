package arisyrifki.app.ensiklopediahewan;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import arisyrifki.app.ensiklopediahewan.Adapter.AdapterContainer;
import arisyrifki.app.ensiklopediahewan.Fragment.FragmentFun;
import arisyrifki.app.ensiklopediahewan.Fragment.FragmentHewan;
import arisyrifki.app.ensiklopediahewan.Fragment.FragmentSatwa;

public class MainActivity extends AppCompatActivity {

    private AdapterContainer mAdapterContainer;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdapterContainer = new AdapterContainer(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.Vpager);


        setupViewPager(mViewPager);
    }
    private void setupViewPager (ViewPager viewPager){
        AdapterContainer adapter = new AdapterContainer(getSupportFragmentManager());
        adapter.addFragment(new FragmentHewan(),"HewanFragment");
        adapter.addFragment(new FragmentSatwa(),"SatwaFragment");
        adapter.addFragment(new FragmentFun(),"FunfactFragment");

        viewPager.setAdapter(adapter);
    }
    public void setViewPager(int fragmentNumber){
        mViewPager.setCurrentItem(fragmentNumber);
    }
}
