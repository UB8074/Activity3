package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity {
    Button Daftar;
    EditText Nama, Email, Tlp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        Daftar = findViewById(R.id.button);
        Nama = findViewById(R.id.isiNama);
        Email = findViewById(R.id.isiEmail);
        Tlp = findViewById(R.id.isiNotlp);

        Daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Nama.getText().toString().equals("") || Email.getText().toString().equals("") || Tlp.getText().toString().equals("") ){
                    Toast.makeText(getApplicationContext(), "Tolong diisi semua bambank", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Daftar Berhasil", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
