package com.christian.meuprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Luz extends AppCompatActivity implements SensorEventListener
{
    private TextView resposta;
    private ImageView btnMenuLuz;
    private Sensor proximidade;
    private SensorManager medir;;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luz);

        //MAPEAMENTO DE TODOS BOTOES DO LAYOUT
        medir = (SensorManager) this.getSystemService(SENSOR_SERVICE);
        proximidade = medir.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        resposta = findViewById(R.id.resposta);
        btnMenuLuz = findViewById(R.id.btnMenuLuz);

        btnMenuLuz.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirMenuLuz();
                On.mpClique.start();
            }
        });

    }

    @Override
    protected void onResume()
    {
        medir.registerListener( this, proximidade, SensorManager.SENSOR_DELAY_NORMAL);
        super.onResume();
    }

    @Override
    public void onSensorChanged(SensorEvent event)
    {
        if(event.values[0] == 0)
        {
            resposta.setText("MUITOO PERTOO");
            abrirLuzAcessa();
        }
        else
        {
            resposta.setText("MUITOO LONGEE");
        }

    }


    @Override
    protected void onPause() {
        medir.unregisterListener( this, proximidade);
        super.onPause();
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy)
    {

    }

    public void abrirMenuLuz() {
        Intent janela = new Intent(this, Home.class);
        startActivity(janela);
    }

    private void abrirLuzAcessa()
    {
        Intent janela = new Intent(this, LuzAcessa.class);
        startActivity(janela);
    }
    @Override
    public void onPointerCaptureChanged(boolean hasCapture)
    {

    }
}