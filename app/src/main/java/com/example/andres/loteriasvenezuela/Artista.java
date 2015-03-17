package com.example.andres.loteriasvenezuela;

import java.util.List;

/**
 * Created by Andres on 16/03/2015.
 */
public class Artista {

    String nombre;
    String descripcion1;
    String descripcion2;
    String descripcion3;

    List<String> hour1;
    List<String> hour2;
    List<String> hour3;

    private String time11;
    private String thing11;
    private String thing12;
    private String time21;
    private String thing21;
    private String thing22;
    private String time31;
    private String thing31;
    private String thing32;

    public Artista() {
        super();
    }
    public Artista(String nombre,String time11,String thing11,String thing12,String time21,String thing21,String thing22,String time31,String thing31,String thing32) {
        super();
        this.nombre = nombre;
        this.setTime11(time11);
        this.setThing11(thing11);
        this.setThing12(thing12);
        this.setTime21(time21);
        this.setThing21(thing21);
        this.setThing22(thing22);
        this.setTime31(time31);
        this.setThing31(thing31);
        this.setThing32(thing32);
    }
    public Artista(String nombre, List<String> hour1, List<String> hour2, List<String> hour3) {
        super();
        this.nombre = nombre;
        this.hour1 = hour1;
        this.hour2 = hour2;
        this.hour3 = hour3;
    }
    public Artista(String nombre, String descripcion1, String descripcion2, String descripcion3) {
        super();
        this.nombre = nombre;
        this.descripcion1 = descripcion1;
        this.descripcion2 = descripcion2;
        this.descripcion3 = descripcion3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion1() {
        return descripcion1;
    }

    public void setDescripcion1(String descripcion1) {
        this.descripcion1 = descripcion1;
    }
    public String getDescripcion2() {
        return descripcion2;
    }

    public void setDescripcion2(String descripcion2) {
        this.descripcion2 = descripcion2;
    }public String getDescripcion3() {
        return descripcion3;
    }

    public void setDescripcion3(String descripcion3) {
        this.descripcion3 = descripcion3;
    }


    public String getTime11() {
        return time11;
    }

    public void setTime11(String time11) {
        this.time11 = time11;
    }

    public String getThing11() {
        return thing11;
    }

    public void setThing11(String thing11) {
        this.thing11 = thing11;
    }

    public String getThing12() {
        return thing12;
    }

    public void setThing12(String thing12) {
        this.thing12 = thing12;
    }

    public String getTime21() {
        return time21;
    }

    public void setTime21(String time21) {
        this.time21 = time21;
    }

    public String getThing21() {
        return thing21;
    }

    public void setThing21(String thing21) {
        this.thing21 = thing21;
    }

    public String getThing22() {
        return thing22;
    }

    public void setThing22(String thing22) {
        this.thing22 = thing22;
    }

    public String getTime31() {
        return time31;
    }

    public void setTime31(String time31) {
        this.time31 = time31;
    }

    public String getThing31() {
        return thing31;
    }

    public void setThing31(String thing31) {
        this.thing31 = thing31;
    }

    public String getThing32() {
        return thing32;
    }

    public void setThing32(String thing32) {
        this.thing32 = thing32;
    }
}
