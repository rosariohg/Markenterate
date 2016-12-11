package com.debugcc.markenterate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.LinearLayout;

public class CampoOc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campo_oc);
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
                        "El licenciado en Marketing participará en:\n" + "<br>" +
                        "<br>" +
                        "\n" +
                        "•&nbsp&nbsp&nbsp Áreas, departamentos, unidades de comercialización de las organizaciones nacionales e internacionales dedicadas a investigación de mercados, inducción de productos, precios y marcas, promoción, publicidad a desarrollarse en las distintas plazas, operaciones de créditos y cobranzas, análisis de la competitividad, comportamiento y sostenimiento del mercado e imagen institucional. Organizaciones nacionales e internacionales dedicadas a la comercialización de bienes y servicios, Equipos y fuerza de ventas.\n" +
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
                        "•&nbsp&nbsp&nbsp Empresas e instituciones dedicadas a las negociaciones internacionales.\n"
                        +
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
                        "•&nbsp&nbsp&nbsp Empresas que desarrollan actividades de exportación e importación. \n"
                        +
                        " </body>\n" +
                        "</html>\n"
                , "text/html; charset=utf-8", "utf-8");

    }

}
