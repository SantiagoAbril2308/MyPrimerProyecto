package com.fred.miprimerproyecto;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEnter = findViewById(R.id.btnEnter);
        btnEnter.setOnClickListener(v ->
                Toast.makeText(MainActivity.this,
                        getString(R.string.welcome_message),
                        Toast.LENGTH_SHORT).show()
        );
    }
}
