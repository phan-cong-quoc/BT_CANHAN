package com.example.bt_canhan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button ok = findViewById(R.id.btn);
        ok.setOnClickListener(v -> {
            // Chuyển sang Activity khác khi nhấn "OK"
            Intent intent = new Intent( MainActivity.this, MainActivity2.class);  // Chuyển đến SecondActivity
            startActivity(intent); // Mở SecondActivity
        });

    }
}