package com.example.sehirresimsecici;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class AnkaraActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ankara_activity);

        ((ImageView)findViewById(R.id.img1)).setImageResource(R.drawable.ank1);
        ((ImageView)findViewById(R.id.img2)).setImageResource(R.drawable.ank2);
        ((ImageView)findViewById(R.id.img3)).setImageResource(R.drawable.ank3);

        ((TextView)findViewById(R.id.txt1)).setText("Anıtkabir");
        ((TextView)findViewById(R.id.txt2)).setText("Ankara Kalesi");
        ((TextView)findViewById(R.id.txt3)).setText("Cumhuriyet Müzesi");
    }
}
