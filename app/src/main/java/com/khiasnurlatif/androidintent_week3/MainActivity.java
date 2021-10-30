package com.khiasnurlatif.androidintent_week3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputName = (EditText) findViewById(R.id.id_input_name);
        EditText inputEmail = (EditText) findViewById(R.id.id_input_email);
        EditText inputPhone = (EditText) findViewById(R.id.id_input_phone);
        EditText inputPassword = (EditText) findViewById(R.id.id_input_pwd);

        Button btnSave = (Button) findViewById(R.id.id_button_save);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Kode untuk aksi dari klik Button
                Log.d("--Nama--", inputName.getText().toString());
                Log.d("--Nama--", inputEmail.getText().toString());
                Log.d("--Nama--", inputPhone.getText().toString());
                Log.d("--Nama--", inputPassword.getText().toString());

            }
        });
    }
}