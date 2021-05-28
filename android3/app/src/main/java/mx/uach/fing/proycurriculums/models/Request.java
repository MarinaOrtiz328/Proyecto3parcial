package mx.uach.fing.proycurriculums.models;

import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;

import mx.uach.fing.proycurriculums.MainActivity;

public class Request {
    private RequestQueue queue;
    private StringRequest sr;

    public Request(String url){

        this.queue=MainActivity.queue;
        sr = new StringRequest(com.android.volley.Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {


                Curriculum curriculum = new Gson().fromJson(response.toString(), Curriculum.class);
                MainActivity.txtVw[0].setText(curriculum.titulo);
                MainActivity.txtVw[1].setText(curriculum.nombre);
                MainActivity.txtVw[2].setText(curriculum.numero);
                MainActivity.txtVw[3].setText(curriculum.correo);
                MainActivity.txtVw[4].setText(curriculum.objetivo);
                MainActivity.txtVw[5].setText(curriculum.experiencia);
                MainActivity.txtVw[6].setText(curriculum.preparacion);
                MainActivity.txtVw[7].setText(curriculum.idiomas);
                MainActivity.txtVw[8].setText(curriculum.habilidades);


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.i("weather-request-error", error.getMessage());
            }
        });
        queue.add(sr);
    }

}
