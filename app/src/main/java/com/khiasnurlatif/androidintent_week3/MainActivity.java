package com.khiasnurlatif.androidintent_week3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    final public static String EXTRA_NAME = "extra_name";
    final public static String EXTRA_EMAIL = "extra_email";
    final public static String EXTRA_PHONE = "extra_phone";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputName = (EditText) findViewById(R.id.id_input_name);
        EditText inputEmail = (EditText) findViewById(R.id.id_input_email);
        EditText inputPhone = (EditText) findViewById(R.id.id_input_phone);
        EditText inputPassword = (EditText) findViewById(R.id.id_input_pwd);

        Button btnSave = (Button) findViewById(R.id.id_button_save);
        btnSave.setOnClickListener(v ->{
            Intent loginIntent = new Intent(MainActivity.this,
                    DashboardActivity.class);
            loginIntent.putExtra(EXTRA_NAME, inputName.getText().toString());
            loginIntent.putExtra(EXTRA_EMAIL, inputEmail.getText().toString());
            loginIntent.putExtra(EXTRA_PHONE, inputPhone.getText().toString());
            startActivity(loginIntent);
        });
    }
}