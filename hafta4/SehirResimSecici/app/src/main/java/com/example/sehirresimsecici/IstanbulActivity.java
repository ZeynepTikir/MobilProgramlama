package com.example.sehirresimsecici;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class IstanbulActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.istanbul_activity);

        ((ImageView)findViewById(R.id.img1)).setImageResource(R.drawable.ist1);
        ((ImageView)findViewById(R.id.img2)).setImageResource(R.drawable.ist2);
        ((ImageView)findViewById(R.id.img3)).setImageResource(R.drawable.ist3);

        ((TextView)findViewById(R.id.txt1)).setText("Galata Kulesi");
        ((TextView)findViewById(R.id.txt2)).setText("Ayasofya");
        ((TextView)findViewById(R.id.txt3)).setText("Kız Kulesi");
    }
}
