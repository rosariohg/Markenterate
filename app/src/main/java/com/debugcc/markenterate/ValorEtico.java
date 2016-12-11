package com.debugcc.markenterate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.LinearLayout;

public class ValorEtico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valor_etico);
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
                        "Creemos en la calidad académica y de gestión. La calidad de la educación depende de la gente que los produce docentes, discentes y personal administrativo. Creemos que el estudiante es el centro de todas nuestras actividades y como tal el fin superior. En ese sentido para lograr esa sagrada misión buscamos ser coherentes con los siguientes principios y valores éticos:\n" + "<br>" +

                        "<br>" +
                        "• Responsabilidad: Responsabilidad en general con el medio ambiente, con la sociedad, con nuestros deberes.\n" + "<br>" +
                        "<br>" +
                        "• &nbsp Lealtad: Capaces de ser leales a nuestro trabajo, leales a nuestra institución, cuando no hay lealtad cada quien actúa a beneficio propio.\n" + "<br>" +
                        "<br>" +
                        "•&nbsp&nbspCooperación: Somos un solo equipo como universidad y como escuela, participar todos de los problemas y de las soluciones y así lograr una mejor reputación como institución.\n" + "<br>" +
                        "<br>" +
                        "• Espíritu crítico y de investigación: Pertinencia de la enseñanza e investigación con la realidad social.\n" + "<br>" +
                        "<br>" +
                        "• Pertinencia y compromiso con el desarrollo del país y globalización: En un marco de preservación y mejora de nuestro ambiente (ecología).\n" +
                        " </body>\n" +
                        "</html>\n"
                , "text/html; charset=utf-8", "utf-8");


    }
}
