package com.debugcc.markenterate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.LinearLayout;

public class Mision extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mision);
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
                        " La Escuela profesional de marketing atiende las necesidades de la Macro región sur en el área de mercado con profesionales en marketing que busquen optimizar la gestión comercial del sector empresarial agropecuario, turístico, minero, y de manufactura, priorizando el acoplamiento regional, Brasil, Bolivia y Chile. Desarrollando Estrategias de mercadeo vinculadas con la estrategia organizacional y constante atención a las últimas tendencias tecnológicas, económicas, culturales y sociales para identificar oportunidades de innovación permanente.\n" +
                        "<br>" + "<br>" +
                        "Cuenta con una plana docente competente y actualizada de la realidad regional, nacional e internacional que transmiten y preparan a los futuros profesionales en marketing, con un sólido sentido de la ética y la responsabilidad social sobre el impacto de sus estrategias en la sociedad , creando valor en la misma. A la altura de las exigencias de una globalización, cada vez más agresiva.\n" +
                        " </body>\n" +
                        "</html>\n"
                , "text/html; charset=utf-8", "utf-8");


    }

}
