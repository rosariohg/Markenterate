package com.debugcc.markenterate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.LinearLayout;

public class PerfilEstudiante extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_estudiante);
        justificarTexto();
    }

    public void justificarTexto() {
        WebView view1 = new WebView(this);
        view1.setVerticalScrollBarEnabled(false);

        ((LinearLayout) findViewById(R.id.texto1)).addView(view1);

        view1.loadData(
                "<html>\n" +
                        " <head></head>\n" +
                        " <body style=\"text-align:justify;color:#222;\">\n" + "<br>" +
                        "• &nbsp Formación humanista y filosófica\n" + "<br>" + "<br>" +
                        "• Identifica las necesidades del mercado local e internacional\n" + "<br>" + "<br>" +
                        "• Optimiza la gestión comercial de una organización\n" + "<br>" + "<br>" +
                        "• Comprende el comportamiento de los grupos sociales, en general, y de los consumidores, en particular\n" + "<br>" + "<br>" +
                        "• Diseña estrategias de mercadeo y propuestas de nuevos negocios\n" + "<br>" + "<br>" +
                        "• Ser investigador del ambiente interno y externo de la organización\n" + "<br>" + "<br>" +
                        "• Consolidar su criterio de responsabilidad social y planetaria.\n"+
                        " </body>\n" +
                        "</html>\n"
                , "text/html; charset=utf-8", "utf-8");


    }
}
