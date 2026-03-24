package com.example.sehirresimsecici;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int[] allImages = {
            R.drawable.ist1, R.drawable.ist2, R.drawable.ist3,
            R.drawable.ank1, R.drawable.ank2, R.drawable.ank3,
            R.drawable.izm1, R.drawable.izm2, R.drawable.izm3
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn2 = findViewById(R.id.btnBasla);

        btn2.setOnClickListener(v -> {

            AlertDialog.Builder uyari1 = new AlertDialog.Builder(MainActivity.this);

            uyari1.setTitle("Şehir Seç");

            // 🔹 Random resim (icon)
            Random r = new Random();
            int randomImage = allImages[r.nextInt(allImages.length)];
            uyari1.setIcon(randomImage);

            // 🔹 Şehir listesi
            CharSequence[] items = {"İstanbul", "Ankara", "İzmir"};

            uyari1.setItems(items, (dialog, i) -> {

                if (i == 0) {
                    startActivity(new Intent(MainActivity.this, IstanbulActivity.class));
                }
                else if (i == 1) {
                    startActivity(new Intent(MainActivity.this, AnkaraActivity.class));
                }
                else if (i == 2) {
                    startActivity(new Intent(MainActivity.this, IzmirActivity.class));
                }

            });

            uyari1.show();
        });
    }
}