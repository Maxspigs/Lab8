package com.example.pigeo.quoifaire;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Fragment> fragments = new ArrayList<>();

        fragments.add(new RestoFragment());
        fragments.add(new TvFragment());
        fragments.add(new SortirFragment());

        List<String> titres = new ArrayList<>();
        titres.add("Resto");
        titres.add("Télé");
        titres.add("Sortir");

        QuoiFaireAdapter adapter = new QuoiFaireAdapter(getSupportFragmentManager(), fragments, titres);

        ViewPager vp = findViewById(R.id.viewPager);
        vp.setAdapter(adapter);

        TabLayout tl = findViewById(R.id.tabLayout);
        tl.setupWithViewPager(vp);


    }

}
