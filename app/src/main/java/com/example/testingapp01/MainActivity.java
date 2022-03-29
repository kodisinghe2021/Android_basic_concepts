package com.example.testingapp01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    public void onClick(View view) {
        TextView txtv = findViewById(R.id.txtV_hel);
        txtv.setText("Bye World");
        Toast.makeText(this,"this is taost",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnclickme = findViewById(R.id.btn_clickme);
        btnclickme.setOnClickListener(this);

        btnclickme.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(MainActivity.this,"Long press",Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }



}