package mx.uach.fing.proycurriculums;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import mx.uach.fing.proycurriculums.models.Request;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public static TextView [] txtVw = null;
    public static RequestQueue queue = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtVwTitulo = findViewById(R.id.txtTituloC2);
        TextView txtVwNombre = findViewById(R.id.txtNombreC2);
        TextView txtVwNumero = findViewById(R.id.txtNumeroC2);
        TextView txtVwCorreo = findViewById(R.id.txtCorreoC2);
        TextView txtVwObjetivo = findViewById(R.id.txtObjetivoC2);
        TextView txtVwExperiencia = findViewById(R.id.txtExperienciaC2);
        TextView txtVwPreparacion = findViewById(R.id.txtPreparacionC2);
        TextView txtVwIdiomas = findViewById(R.id.txtIdiomasC2);
        TextView txtVwHabilidades = findViewById(R.id.txtHabilidadesC2);

        txtVw = new TextView[9];
        txtVw[0]= txtVwTitulo;
        txtVw[1]= txtVwNombre;
        txtVw[2]= txtVwNumero;
        txtVw[3]= txtVwCorreo;
        txtVw[4]= txtVwObjetivo;
        txtVw[5]= txtVwExperiencia;
        txtVw[6]= txtVwPreparacion;
        txtVw[7]= txtVwIdiomas;
        txtVw[8]= txtVwHabilidades;

        Button btn329577 = (Button)findViewById(R.id.btn329577);

        Button btn329842 = (Button)findViewById(R.id.btn329842);

        Button btn315120 = (Button)findViewById(R.id.btn315120);
        btn329577.setOnClickListener(this);
        btn329842.setOnClickListener(this);
        btn315120.setOnClickListener(this);

        queue = Volley.newRequestQueue(this);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {

        /*
        *     INSERTAR URL EN LA VARIABLE DE ABAJO
         */
        String url = "https://64e3a9e43533.ngrok.io"; //AQUI SE PONE LA URL DE ngrok
        /*
        *   INSERTAR URL EN LA VARIABLE DE ARRIBA
         */

        String url329577 = url+"/329577";
        String url315120= url+"/315120";
        String url329842= url+"/329842";

        switch(v.getId()){
            case R.id.btn329577:

                Request request = new Request(url329577);
                break;

            case R.id.btn315120:

                Request request2 = new Request(url315120);
                break;

            case R.id.btn329842:

                Request request3 = new Request(url329842);
                break;

        }
    }
}