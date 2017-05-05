package mariaiaf.peajesenlaruta;

import java.util.ArrayList;

/**
 * Created by MIAF on 5/05/2017.
 */

public class ManejadorDeDatos extends Object{

    public static ArrayList<String> nombre = new ArrayList<String>();
    public static ArrayList<Float> latitud = new ArrayList<Float>();
    public static ArrayList<Float> longitud = new ArrayList<Float>();
    public static ArrayList<String> informacion = new ArrayList<String>();
    public static ArrayList<Integer> valorCategoria = new ArrayList<Integer>();


    private static final ManejadorDeDatos INSTANCE = new ManejadorDeDatos();

    //====================================================
    // CONSTRUCTOR
    //====================================================

    public ManejadorDeDatos() {
    }

    //====================================================
    // GETTERS & SETTERS
    //====================================================
    public static ManejadorDeDatos getInstance(){
        return INSTANCE;
    }

    public static ArrayList<String> ObtenerListaNombres() {
        return nombre;
    }

    public static ArrayList<Float> ObtenerListaLatitud() {
        return latitud;
    }
    public static ArrayList<Float> ObtenerListaLongitud() {
        return longitud;
    }
    public static ArrayList<String> ObtenerListaInformacion() {
        return informacion;
    }
    public static ArrayList<Integer> ObtenerListaValorCategoria() {
        return valorCategoria;
    }

    public void SetearNombre(String nombres) {
        nombre.add(nombres);
    }


}

