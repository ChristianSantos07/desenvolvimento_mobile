package com.christian.meuprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LuzAcessa extends AppCompatActivity
{
    private ImageView btnMenuAcesa;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luz_acessa);

        btnMenuAcesa = findViewById(R.id.btnMenuAcesa);

        btnMenuAcesa.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirMenuAcesa();
            }
        });
    }
    private void abrirMenuAcesa()
    {
        Intent janela = new Intent(this, Home.class);
        startActivity(janela);
    }
}