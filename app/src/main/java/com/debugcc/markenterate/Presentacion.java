package com.debugcc.markenterate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.LinearLayout;

public class Presentacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentacion);
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
                        "El marketing es un enfoque organizacional que va más allá de la producción, los procesos y la rentabilidad, orienta a las empresas permanentemente a reinventarse en un mercado cada vez más cambiante.\n" +
                        "la Escuela Profesional de Marketing, surge como respuesta a la demanda del empresariado regional, de contar con cuadros profesionales , nuevas tendencias en ventas, cadena de suministritos comercial, redes de mercado, comercio minorista (retail), investigación de mercados y globalización.\n" + "<br>" +
                        "<br>" +
                        "Exhortamos a los jóvenes egresados de los colegios secundarios de la macro región sur a explorar esta nueva alternativa de realización profesional, contamos con equipamiento de laboratorios de informática, infraestructura acorde con las exigencias que demanda la modernidad y plana docente en permanente capacitación en al área de marketing que propicia el desarrollo integral de nuestros alumnos del pregrado. \n" +
                        " </body>\n" +
                        "</html>\n"
                , "text/html; charset=utf-8", "utf-8");


    }
}
