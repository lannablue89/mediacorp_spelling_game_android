package com.media2359.mediacorpspellinggame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.media2359.mediacorpspellinggame.data.DataRepo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        DataRepo.getInstance().onDestroy();
    }
}
