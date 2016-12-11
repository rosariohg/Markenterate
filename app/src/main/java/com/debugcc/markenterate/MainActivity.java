package com.debugcc.markenterate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button btnPresentacion;
    Button btnMision;
    Button btnVision;
    Button btnValEt;
    Button btnCampO;
    Button btnPerEs;
    Button btnAut;
    Button btnDoc;
    Button btnAct;
    Button btnUltRan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPresentacion = (Button) findViewById(R.id.btnPresentacion);
        btnMision = (Button) findViewById(R.id.btnMision);
        btnVision = (Button) findViewById(R.id.btnVision);
        btnValEt= (Button) findViewById(R.id.btnValoresEticos);
        btnCampO = (Button) findViewById(R.id.btnCampoOcupacional);
        btnPerEs = (Button) findViewById(R.id.btnPerfilEstudiante);
        btnAut = (Button) findViewById(R.id.btnAutoridades);
        btnDoc = (Button) findViewById(R.id.btnDocentes);
        btnAct = (Button) findViewById(R.id.btnActividades);
        btnUltRan = (Button) findViewById(R.id.btnUltimoRanking);
        changeSixe();
        btnPresentacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Presentacion.class);
                startActivity(intent);
            }
        });
        btnMision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Mision.class);
                startActivity(intent);
            }
        });
        btnVision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Vision.class);
                startActivity(intent);
            }
        });
        btnValEt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ValorEtico.class);
                startActivity(intent);
            }
        });
        btnCampO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CampoOc.class);
                startActivity(intent);
            }
        });
        btnPerEs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PerfilEstudiante.class);
                startActivity(intent);
            }
        });
        btnAut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Autoridades.class);
                startActivity(intent);
            }
        });
        btnDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Docentes.class);
                startActivity(intent);
            }
        });
        btnAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Actividades.class);
                startActivity(intent);
            }
        });
        btnUltRan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), UltimoRanking.class);
                startActivity(intent);
            }
        });
    }


    public void changeSixe(){
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int height = displaymetrics.heightPixels;
        int width = displaymetrics.widthPixels;
        int val= (int) (width/2.5);
        btnPresentacion.setHeight(val);
        btnMision.setHeight(val);
        btnValEt.setHeight(val);
        btnCampO.setHeight(val);
        btnPerEs.setHeight(val);
        btnAut.setHeight(val);
        btnDoc.setHeight(val);
        btnAct.setHeight(val);
        btnUltRan.setHeight(val);
    }
}
