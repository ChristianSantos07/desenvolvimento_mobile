package com.christian.meuprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class On extends AppCompatActivity
{
    public static MediaPlayer mpClique;
    private ImageView btnOnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on);

        mpClique = MediaPlayer.create(this, R.raw.clique);

        btnOnHome = findViewById(R.id.btnOnHome);

        btnOnHome.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mpClique.start();
                abirHomeDispo();
            }
        });
    }

    public void abirHomeDispo()
    {
        Intent janela = new Intent(this, Home.class);
        startActivity(janela);
    }
}