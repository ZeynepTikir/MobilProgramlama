package com.example.sehirresimsecici;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class IzmirActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.izmir_activity);

        ((ImageView)findViewById(R.id.img1)).setImageResource(R.drawable.izm1);
        ((ImageView)findViewById(R.id.img2)).setImageResource(R.drawable.izm2);
        ((ImageView)findViewById(R.id.img3)).setImageResource(R.drawable.izm3);

        ((TextView)findViewById(R.id.txt1)).setText("Kadifekale Dağı");
        ((TextView)findViewById(R.id.txt2)).setText("İzmir Arkeoloji Müzesi");
        ((TextView)findViewById(R.id.txt3)).setText("Kızlarağası Hanı");
    }
}