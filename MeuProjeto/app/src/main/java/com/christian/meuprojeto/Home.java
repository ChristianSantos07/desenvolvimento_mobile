package com.christian.meuprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Home extends AppCompatActivity
{
    private ImageView btnTv, btnLuz;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnTv = findViewById(R.id.btnTv);
        btnLuz = findViewById(R.id.btnLuz);

        btnTv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abirMenuTv();
                On.mpClique.start();
            }
        });

        btnLuz.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirLuz();
                On.mpClique.start();
            }
        });
    }

    private void abrirLuz()
    {
        Intent janela = new Intent(this, Luz.class);
        startActivity(janela);
    }

    private void abirMenuTv()
    {
        Intent janela = new Intent(this, Television.class);
        startActivity(janela);
    }
}