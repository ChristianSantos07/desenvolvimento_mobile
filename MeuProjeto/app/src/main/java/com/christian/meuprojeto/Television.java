package com.christian.meuprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class Television extends AppCompatActivity
{
    private ImageView btnOn, btnMenuTelevision;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_television);

        btnOn = findViewById(R.id.btnLigar);
        btnMenuTelevision = findViewById(R.id.btnMenuTelevision);

        btnMenuTelevision.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirMenuTelevision();
            }
        });

        btnOn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirTv();
            }
        });
    }

    private void abrirMenuTelevision()
    {
        Intent janela = new Intent(this, Home.class);
        startActivity(janela);
    }

    private void abrirTv()
    {
        Intent janela = new Intent(this, TelevisionOn.class);
        startActivity(janela);
    }

}