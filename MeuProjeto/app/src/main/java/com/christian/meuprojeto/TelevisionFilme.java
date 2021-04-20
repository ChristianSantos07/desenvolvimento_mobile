package com.christian.meuprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.VideoView;

public class TelevisionFilme extends AppCompatActivity {
    private VideoView vdFilme;
    private ImageView btnDownF, btnUpF, btnLeftF, btnRightF, btnOkF, btnOnF, btnOffF, btnMenuFilme;
    //Handler setDelayFilme;
    //Runnable startDelayFilme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_television_filme);

        vdFilme = findViewById(R.id.vdFilme);
        btnDownF = findViewById(R.id.btnDownF);
        btnUpF = findViewById(R.id.btnUpF);
        btnLeftF = findViewById(R.id.btnLeftF);
        btnRightF = findViewById(R.id.btnRightF);
        btnOkF = findViewById(R.id.btnOkF);
        btnOnF = findViewById(R.id.btnLigar);
        btnOffF = findViewById(R.id.btnOffF);
        btnMenuFilme = findViewById(R.id.btnMenuFilme);

        btnLeftF.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.malvado);
                vdFilme.setVideoURI(caminho);
                vdFilme.start();
                Toast.makeText(getApplicationContext(), "Você está assistindo Meu Malvado Favorito 2 ", Toast.LENGTH_SHORT).show();
            }
        });

        btnMenuFilme.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirMenuFilme();
            }
        });

        btnRightF.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.panico);
                vdFilme.setVideoURI(caminho);
                vdFilme.start();
                Toast.makeText(getApplicationContext(), "Você está assistindo  Todo Mundo em Pânico 2", Toast.LENGTH_SHORT).show();
            }
        });

        btnUpF.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.branquelas);
                vdFilme.setVideoURI(caminho);
                vdFilme.start();
                Toast.makeText(getApplicationContext(), "Você está assistindo  As Branquelas", Toast.LENGTH_SHORT).show();
            }
        });

        btnDownF.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Uri caminho4 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.vovozona);
                vdFilme.setVideoURI(caminho4);
                vdFilme.start();
                Toast.makeText(getApplicationContext(), "Você está assistindo Vovozona 2", Toast.LENGTH_SHORT).show();
            }
        });

        btnOnF.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(), "A Televisão já está ligada", Toast.LENGTH_SHORT).show();
            }
        });

        btnOffF.setOnClickListener(new View.OnClickListener()
        {
        @Override
            public void onClick(View v)
            {
               abrirOff();
            }
        });
    }

    private void abrirMenuFilme()
    {
        Intent janela = new Intent(this, Home.class);
        startActivity(janela);
    }

    private void abrirOff()
    {
        Intent janela = new Intent(this, TelevisionOff.class);
        startActivity(janela);
    }
}