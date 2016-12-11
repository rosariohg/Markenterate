package com.debugcc.markenterate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.LinearLayout;

public class Actividades extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividades);
        justificarTexto();
    }

    public void justificarTexto(){
        WebView view1 = new WebView(this);
        view1.setVerticalScrollBarEnabled(false);

        ((LinearLayout)findViewById(R.id.texto1)).addView(view1);

        view1.loadData(
                "<html>\n" +
                        " <head></head>\n" +
                        " <body style=\"text-align:justify;color:#222;\">\n" +
                        " La Escuela Profesional de Marketing, no solo organiza eventos académicos para el progreso propio de los estudiantes, si no también realiza visitas a empresas que nos ayudan a entender el trabajo de un Mercadólogo en la sociedad, vamos de la mano con los deportes y además somos un grupo humano que se preocupa por la sociedad y por ello realizamos diferentes actividades de proyección social.\n" +
                        "\n" + "<br>" +
                        "<br>" +
                        "•&nbsp&nbsp&nbsp Congreso (MARCA PERÚ) 2015 – Sara Maria Moyan\n" + "<br>" +
                        "<br>" +
                        "•&nbsp&nbsp&nbsp Visita a Backus\n" +
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
                        "•&nbsp&nbsp&nbsp Visita a Gloria – 2015" +
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
                        "•&nbsp&nbsp&nbsp Campaña Navideña – Asociación Sr de los Milagros, Cayma" +
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
                        "•&nbsp&nbsp&nbsp Visita a Sunat de Matarani – 2016 " +
                        " </body>\n" +
                        "</html>\n"
                , "text/html; charset=utf-8", "utf-8");

        WebView view5 = new WebView(this);
        view5.setVerticalScrollBarEnabled(false);

        ((LinearLayout)findViewById(R.id.texto5)).addView(view5);

        view5.loadData(
                "<html>\n" +
                        " <head></head>\n" +
                        " <body style=\"text-align:justify;color:#222;\">\n" +
                        "•&nbsp&nbsp&nbsp Actividades de integración ( Bienvenida Cachimbo 2016 )" +
                        " </body>\n" +
                        "</html>\n"
                , "text/html; charset=utf-8", "utf-8");

        WebView view6 = new WebView(this);
        view6.setVerticalScrollBarEnabled(false);

        ((LinearLayout)findViewById(R.id.texto6)).addView(view6);

        view6.loadData(
                "<html>\n" +
                        " <head></head>\n" +
                        " <body style=\"text-align:justify;color:#222;\">\n" +
                        "•&nbsp&nbsp&nbsp Ganadores en concurso de Ajedrez" +
                        " </body>\n" +
                        "</html>\n"
                , "text/html; charset=utf-8", "utf-8");

        WebView view7 = new WebView(this);
        view7.setVerticalScrollBarEnabled(false);

        ((LinearLayout)findViewById(R.id.texto7)).addView(view7);

        view7.loadData(
                "<html>\n" +
                        " <head></head>\n" +
                        " <body style=\"text-align:justify;color:#222;\">\n" +
                        "•&nbsp&nbsp&nbsp Campaña contra el friaje Condoroma – 2016 " +
                        " </body>\n" +
                        "</html>\n"
                , "text/html; charset=utf-8", "utf-8");


    }
}
