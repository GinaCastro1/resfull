package com.example.revista1;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;

public class revista {

      public revista(JSONObject a) throws JSONException {
        anio =  a.getString("anio");
        mes = a.getString("mes");
        urlportada = "https://uteq.edu.ec/assets/images/newspapers/"+ a.getString("urlportada").toString();
        urlpw = a.getString("urlpw").toString() ;
    }

    public static ArrayList<revista> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<revista> revista = new ArrayList<>();

        for (int i = 0; i < datos.length() && i<20; i++) {
            revista.add(new revista(datos.getJSONObject(i)));
        }
        return revista;
    }


    public String getAnio() {
        return anio;
    }
    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getMes() {
        return mes;
    }
    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getUrlportada() {
        return urlportada;
    }
    public void setUrlportada(String urlportada) {
        this.urlportada = urlportada;
    }

    public String getUrlpw() {
        return urlpw;
    }
    public void setUrlpw(String urlpw) {
        this.urlpw = urlpw;
    }

    private String  anio;
    private String  mes;
    private String urlportada;
    private String urlpw;
}
