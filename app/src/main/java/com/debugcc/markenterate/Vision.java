package com.debugcc.markenterate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.LinearLayout;

public class Vision extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vision);
        justificarTexto();
    }

    public void justificarTexto() {
        WebView view1 = new WebView(this);
        view1.setVerticalScrollBarEnabled(false);

        ((LinearLayout) findViewById(R.id.texto1)).addView(view1);

        view1.loadData(
                "<html>\n" +
                        " <head></head>\n" +
                        " <body style=\"text-align:justify;color:#222;\">\n" +
                        "Ser una escuela profesional que genere constantemente una corriente de opinión, profesionales, investigadores y apoyo a los grupos de interés de la región y el país; a partir de la formación académica y organización de eventos, que ayuden a cristalizar esta visión. Con la calidad integral que priorice los valores humanos supremos y contribuyan a la mejora cualitativa y cuantitativa de las ofertas regionales y nacionales, participando en la globalización equitativa." +
                        " </body>\n" +
                        "</html>\n"
                , "text/html; charset=utf-8", "utf-8");


    }
}
