package com.example.andres.loteriasvenezuela;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.os.Bundle;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends ActionBarActivity      {
    TextView buscarArtista, nombreArtista, descripcionArtista1, descripcionArtista2, descripcionArtista3,
    time11Auto,
    thing11Auto,
    thing12Auto,
    time21Auto,
    thing21Auto,
    thing22Auto,
    time31Auto,
    thing31Auto,
    thing32Auto;
    Button buscar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*        final ArtistaApi api = new ArtistaApi(getApplicationContext());

        buscarArtista = (TextView) findViewById(R.id.buscarArtista);
        nombreArtista = (TextView) findViewById(R.id.nombreArtista);
        descripcionArtista1 = (TextView) findViewById(R.id.descripcionArtista1);
        descripcionArtista2 = (TextView) findViewById(R.id.descripcionArtista2);
        descripcionArtista3 = (TextView) findViewById(R.id.descripcionArtista3);
        buscar = (Button) findViewById(R.id.buscar);

        final Artista artista = api.buscarArtista(buscarArtista.getText().toString());
        nombreArtista.setText(artista.getNombre());
        descripcionArtista1.setText(artista.getDescripcion1());
        descripcionArtista2.setText(artista.getDescripcion2());
        descripcionArtista3.setText(artista.getDescripcion3());*/

 /*        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               final Artista artista = api.buscarArtista(buscarArtista.getText().toString());
                nombreArtista.setText(artista.getNombre());
                descripcionArtista1.setText(artista.getDescripcion1());
                descripcionArtista2.setText(artista.getDescripcion2());
                descripcionArtista3.setText(artista.getDescripcion3());
            }
        });
*/


        Thread t = new Thread() {

            @Override
            public void run() {
                try {
                    while (!isInterrupted()) {

                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                ArtistaApi api;
                                Artista artista;
                                api = new ArtistaApi(getApplicationContext());

                                nombreArtista = (TextView) findViewById(R.id.nombreArtista);
                                /*this.nombre = nombre;
                                this.time11 = time11;
                                this.thing11 = thing11;
                                this.thing12 = thing12;
                                this.time21 = time21;
                                this.thing21 = thing21;
                                this.thing22 = thing22;
                                this.time31 = time31;
                                this.thing31 = thing31;
                                this.thing32 = thing32;*/

                                /*descripcionArtista1 = (TextView) findViewById(R.id.descripcionArtista1);
                                descripcionArtista2 = (TextView) findViewById(R.id.descripcionArtista2);
                                descripcionArtista3 = (TextView) findViewById(R.id.descripcionArtista3);*/

                                time11Auto = (TextView) findViewById(R.id.time11Auto);
                                thing11Auto = (TextView) findViewById(R.id.thing11Auto);
                                thing12Auto = (TextView) findViewById(R.id.thing12Auto);
                                time21Auto = (TextView) findViewById(R.id.time21Auto);
                                thing21Auto = (TextView) findViewById(R.id.thing21Auto);
                                thing22Auto = (TextView) findViewById(R.id.thing22Auto);
                                time31Auto = (TextView) findViewById(R.id.time31Auto);
                                thing31Auto = (TextView) findViewById(R.id.thing31Auto);
                                thing32Auto = (TextView) findViewById(R.id.thing32Auto);

                                buscar = (Button) findViewById(R.id.buscar);

                                artista = api.buscarArtista("");
                                nombreArtista.setText(artista.getNombre());
/*                                descripcionArtista1.setText(artista.getDescripcion1());
                                descripcionArtista2.setText(artista.getDescripcion2());
                                descripcionArtista3.setText(artista.getDescripcion3());*/

                                time11Auto.setText(artista.getTime11());
                                thing11Auto.setText(artista.getThing11());
                                thing12Auto.setText(artista.getThing12());
                                time21Auto.setText(artista.getTime21());
                                thing21Auto.setText(artista.getThing21());
                                thing22Auto.setText(artista.getThing22());
                                time31Auto.setText(artista.getTime31());
                                thing31Auto.setText(artista.getThing31());
                                thing32Auto.setText(artista.getThing32());

                            }
                        });
                    }
                } catch (InterruptedException e) {
                }
            }
        };

        t.start();
    }







    private StringBuilder inputStreamToString(InputStream is)
    {
        String rLine = "";
        StringBuilder answer = new StringBuilder();
        BufferedReader rd = new BufferedReader(new InputStreamReader(is));

        try
        {
            while ((rLine = rd.readLine()) != null)
            {
                answer.append(rLine);
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        return answer;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
