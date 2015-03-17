package com.example.andres.loteriasvenezuela;

/**
 * Created by Andres on 16/03/2015.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;

public class ArtistaApi {

    Context c;
    public ArtistaApi(Context c){
        this.c = c;
    }

    @SuppressWarnings("finally")
    public Artista buscarArtista(final String nombreArtista){
        FutureTask<Artista> future =
                new FutureTask<Artista>(
                        new Callable<Artista>() {
                            @Override
                            public Artista call() throws Exception {
                                Artista artista = null;

                                //String respStr = requestGET("http://ws.audioscrobbler.com/2.0/?method=artist.getinfo&artist="+nombreArtista+"&api_key=74915715bead533968da6f59b2b54a65&format=json");
                                String respStr = requestGET("http://andreseloysv.com/lote/lote.php");
                                JSONObject respJSON = new JSONObject(respStr);
                                try {
                                    JSONObject artist = respJSON.getJSONObject("lottoCompany");

                                    String nombre = artist.getString("lottoName");

                                    String descripcion1 = artist.getJSONObject("hour1").getString("time");
                                    String descripcion2 = artist.getJSONObject("hour1").getString("thing1");
                                    String descripcion3 = artist.getJSONObject("hour1").getString("thing2");
                                    //artista = new Artista(nombre, descripcion1,descripcion2,descripcion3);

                                    String time11 = artist.getJSONObject("hour1").getString("time");
                                    String thing11 = artist.getJSONObject("hour1").getString("thing1");
                                    String thing12 = artist.getJSONObject("hour1").getString("thing2");
                                    String time21 = artist.getJSONObject("hour2").getString("time");
                                    String thing21 = artist.getJSONObject("hour2").getString("thing1");
                                    String thing22 = artist.getJSONObject("hour2").getString("thing2");
                                    String time31 = artist.getJSONObject("hour3").getString("time");
                                    String thing31 = artist.getJSONObject("hour3").getString("thing1");
                                    String thing32 = artist.getJSONObject("hour3").getString("thing2");
                                    //artista = new Artista(nombre, descripcion1,descripcion2,descripcion3);
                                    artista = new Artista(nombre, time11,thing11,thing12,time21,thing21,thing22,time31,thing31,thing32);

                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                                return artista;
                            }
                        });
        ExecutorService executor = Executors.newFixedThreadPool(1);
        executor.execute(future);
        Artista artista = new Artista();

        try {
            artista = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
            return  artista;
        }
    }

    public static String requestGET(String url){

        String respStr="";

        HttpClient httpClient = new DefaultHttpClient();

        HttpGet get = new HttpGet(url);

        get.setHeader("content-type", "application/json");

        try {
            HttpResponse resp = httpClient.execute(get);
            respStr = EntityUtils.toString(resp.getEntity());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return respStr;

    }


}
