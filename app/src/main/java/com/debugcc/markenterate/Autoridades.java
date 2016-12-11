package com.debugcc.markenterate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Autoridades extends AppCompatActivity {
    ImageView imgAutoridad1;
    ImageView imgAutoridad2;
    ImageView imgAutoridad3;
    ImageView imgAutoridad4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autoridades);

        imgAutoridad1 = (ImageView) findViewById(R.id.Imag1);
        imgAutoridad2 = (ImageView) findViewById(R.id.Imag2);
        imgAutoridad3 = (ImageView) findViewById(R.id.Imag3);
        imgAutoridad4 = (ImageView) findViewById(R.id.Imag4);

        changeSixe();
        justificarTexto();
    }

    public void changeSixe(){
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int height = displaymetrics.heightPixels;
        int width = displaymetrics.widthPixels;
        int val= (int) (height/4);
        imgAutoridad1.setMaxWidth(val);
        imgAutoridad2.setMaxWidth(val);
        imgAutoridad3.setMaxWidth(val);
        imgAutoridad4.setMaxWidth(val);
    }

    public void justificarTexto(){
        WebView view1 = new WebView(this);
        view1.setVerticalScrollBarEnabled(false);

        ((LinearLayout)findViewById(R.id.texto1)).addView(view1);

        view1.loadData(
                "<html>\n" +
                        " <head></head>\n" +
                        " <body style=\"text-align:justify;color:#222;\">\n" +
                        "DECANO DE LA FACULTAD DE ADMINISTRACIÓN\n" +
                        "Dr. Juan Luna Carpio\n" +
                        " </body>\n" +
                        "</html>\n"
                , "text/html; charset=utf-8", "utf-8");

        WebView view2 = new WebView(this);
        view2.setVerticalScrollBarEnabled(false);

        ((LinearLayout)findViewById(R.id.texto2)).addView(view2);

        view2.loadData(
                "<html>\n" +
                        " <head></head>\n" +
                        " <body style=\"text-align:justify;color:#222;\">\n" +
                        "DIRECTOR DE LA ESCUELA PROFESIONAL DE MARKETING\n"
                        + "Mg. Wilber Valverde Valverde\n" +
                        " </body>\n" +
                        "</html>\n"
                , "text/html; charset=utf-8", "utf-8");

        WebView view3 = new WebView(this);
        view3.setVerticalScrollBarEnabled(false);

        ((LinearLayout)findViewById(R.id.texto3)).addView(view3);

        view3.loadData(
                "<html>\n" +
                        " <head></head>\n" +
                        " <body style=\"text-align:justify;color:#222;\">\n" +
                        "DIRECTOR DE LA ESCUELA PROFESIONAL DE ADMINISTRACIÓN\n"
                        + "Dr. Victor Sotelo Guerra\n" +
                        " </body>\n" +
                        "</html>\n"
                , "text/html; charset=utf-8", "utf-8");

        WebView view4 = new WebView(this);
        view4.setVerticalScrollBarEnabled(false);

        ((LinearLayout)findViewById(R.id.texto4)).addView(view4);

        view4.loadData(
                "<html>\n" +
                        " <head></head>\n" +
                        " <body style=\"text-align:justify;color:#222;\">\n" +
                        "DIRECTOR DE LA ESCUELA PROFESIONAL DE GESTIÓN\n"
                        + "Mg. Yuri García Tejada\n" +
                        " </body>\n" +
                        "</html>\n"
                , "text/html; charset=utf-8", "utf-8");

    }
}
