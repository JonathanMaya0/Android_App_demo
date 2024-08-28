package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //todo : make app work by getting the persons last and fist name and display it to user
        //TODO : Make interface
    }

    @SuppressLint("SetTextI18n")
    public void clickme(View view){
        TextView texthello = findViewById(R.id.hello);
        EditText infoedit = findViewById(R.id.FirstName);
        EditText LastnameEdit =findViewById(R.id.LastName);
        texthello.setText("Hello User " + infoedit.getText().toString()+ " " + LastnameEdit.getText().toString());
        TextView infogone =findViewById(R.id.info);
        infogone.setVisibility(View.GONE);
        EditText firstnameGone = findViewById(R.id.FirstName);
        EditText lastnameGone = findViewById(R.id.LastName);
        lastnameGone.setVisibility(View.GONE);
        firstnameGone.setVisibility(View.GONE);


    }
}