package com.example.pc.viewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Adapter adapter;
    int[] img = {R.drawable.qqq,R.drawable.qqq,
            R.drawable.www,
            R.drawable.eee,
            R.drawable.yyy,
            R.drawable.uuu,
            R.drawable.iii,
            R.drawable.ppp,
            R.drawable.sss};
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.vPager);
        adapter = new Adapter(getApplicationContext(),img);
        viewPager.setAdapter(adapter);
    }
}
