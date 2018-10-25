package com.mohancm.mdfmysore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class SecondA extends AppCompatActivity {

    TextView ranNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.random_num);
        ranNum = findViewById(R.id.random_num);


            Random random = new Random();
            int randomNumber = random.nextInt(15);
            ranNum.setText(String.valueOf(randomNumber));
    }
}
