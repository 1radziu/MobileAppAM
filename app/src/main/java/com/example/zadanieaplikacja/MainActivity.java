package com.example.zadanieaplikacja;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName, editTextSurname, editTextAge, editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextSurname = findViewById(R.id.editTextSurname);
        editTextAge = findViewById(R.id.editTextAge);
        editTextEmail = findViewById(R.id.editTextEmail);
        Button buttonSubmit = findViewById(R.id.buttonSubmit);
        Button buttonReset = findViewById(R.id.buttonReset);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                String surname = editTextSurname.getText().toString();
                String age = editTextAge.getText().toString();
                String email = editTextEmail.getText().toString();


                Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("surname", surname);
                intent.putExtra("age", age);
                intent.putExtra("email", email);
                startActivity(intent);
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextName.setText("");
                editTextSurname.setText("");
                editTextAge.setText("");
                editTextEmail.setText("");
            }
        });
    }
}

