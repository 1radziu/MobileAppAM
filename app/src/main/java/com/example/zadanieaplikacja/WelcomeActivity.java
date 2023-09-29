package com.example.zadanieaplikacja;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        TextView textViewWelcome = findViewById(R.id.textViewWelcome);

        Intent intent = getIntent();
        if (intent != null) {
            String name = intent.getStringExtra("name");
            String surname = intent.getStringExtra("surname");

            String welcomeMessage = "Witaj, " + name + " " + surname + "!";
            textViewWelcome.setText(welcomeMessage);
        }
    }
}
