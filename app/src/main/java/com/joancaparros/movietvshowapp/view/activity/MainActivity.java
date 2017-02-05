package com.joancaparros.movietvshowapp.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.joancaparros.movietvshowapp.R;

public class MainActivity extends AppCompatActivity {

    private Button btnAdd;
    private Button btnList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnList = (Button) findViewById(R.id.btnList);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),AddMovieTVShows.class);
                startActivity(intent);
            }
        });

        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),ListMovieTVShows.class);
                startActivity(intent);
            }
        });


    }
}
