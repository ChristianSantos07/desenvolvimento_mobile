package com.christian.meuprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.VideoView;

public class TelevisionOn extends AppCompatActivity
{
    public VideoView vdOn;
    private ImageView btnOnLig, btnMenuOn;
    Handler setDelayOn;
    Runnable startDelayOn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_television_on);
        setDelayOn = new Handler();

        vdOn = findViewById(R.id.vdOff);
        btnOnLig = findViewById(R.id.btnLigar);
        btnMenuOn = findViewById(R.id.btnMenuOn);

        btnOnLig.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(), "Inicializando, Por Favor Aguarde!!!", Toast.LENGTH_SHORT).show();
            }
        });

        btnMenuOn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirMenuOn();
            }
        });

        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.tvon);
        vdOn.setVideoURI(caminho);
        vdOn.start();
        startDelayOn = new Runnable()
        {
            @Override
            public void run()
            {
                tv();
            }
        };
        setDelayOn.postDelayed(startDelayOn, 10000);
    }

    private void abrirMenuOn()
    {
        Intent janela = new Intent(this, Home.class);
        startActivity(janela);
    }

    public void tv()
    {
        Intent janela = new Intent(this, TelevisionFilme.class);
        startActivity(janela);
    }

}