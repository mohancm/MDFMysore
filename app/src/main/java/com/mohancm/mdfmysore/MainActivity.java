package com.mohancm.mdfmysore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);
    }


    public void toastMe(View view) {
        Toast.makeText(MainActivity.this, "Welcome to Codelabs", Toast.LENGTH_SHORT).show();
    }

    public void countMe(View view) {

        String counter = tv.getText().toString();
        int count = Integer.parseInt(counter);
        count++;
        tv.setText(String.valueOf(count));

    }

    public void randomMe(View view) {

        Intent intent = new Intent(MainActivity.this, SecondA.class);
        startActivity(intent);

    }
}
