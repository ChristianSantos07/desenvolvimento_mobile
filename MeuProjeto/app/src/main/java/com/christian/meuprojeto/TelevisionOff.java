package com.christian.meuprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;

public class TelevisionOff extends AppCompatActivity {
    private VideoView vdOff;
    private ImageView btnLigar, btnMenuOff;
    Handler setDelayOff , setDelayOnOff;
    Runnable  startDelayOff, startDelayOnOff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_television_off);
        setDelayOff = new Handler();
        setDelayOnOff = new Handler();

        vdOff = findViewById(R.id.vdOff);
        btnLigar = findViewById(R.id.btnLigar);
        btnMenuOff = findViewById(R.id.btnMenuOn);


        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.tvoff);
        vdOff.setVideoURI(caminho);
        vdOff.start();

        startDelayOff = new Runnable()
        {
            @Override
            public void run()
            {
                abrirHome();
            }
        };
        setDelayOnOff.postDelayed(startDelayOnOff, 1000);

        btnMenuOff.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirMenuOff();
            }
        });

        btnLigar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.tvon);
                vdOff.setVideoURI(caminho);
                vdOff.start();
                startDelayOnOff = new Runnable()
                {
                    @Override
                    public void run()
                    {
                        abirTvOff();
                    }
                };
                setDelayOnOff.postDelayed(startDelayOnOff, 10000);
            }
        });

    }

    public void abrirMenuOff()
    {
        Intent janela = new Intent(this, Home.class);
        startActivity(janela);
    }

    public void abirTvOff()
    {
        Intent janela = new Intent(this, TelevisionFilme.class);
        startActivity(janela);
    }

    public void abrirHome()
    {
        Intent janela = new Intent(this, Home.class);
        startActivity(janela);
    }

}