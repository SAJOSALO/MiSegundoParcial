
package Modelo;

import Controlador.Comida;
import java.util.HashMap;
import org.json.JSONArray;
import supabase.Supabase;
/**
 *
 * @author Santiago Jose Salgado Lopez
 */
public class BaseDeDatos {
    private  Integer id;
    private static String nombre;
    public static Supabase supabase = new Supabase("https://igqbxxueeykbojmdcayu.supabase.co/"
        , "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImlncWJ4eHVlZXlrYm9qbWRjYXl1Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3MjMxNDI0NzksImV4cCI6MjAzODcxODQ3OX0.O21UGn-f8uXpiE7qiVc0tfqBfD-bIxRhabEpLYFgiQg");

    public BaseDeDatos(Integer id, String nombre) {
        this.id = 0;
        this.nombre = "";
    }

    

    public static JSONArray getID(String tabla){
        JSONArray idArray = supabase.from(tabla).select("id");
        return idArray;
    }
    
    public static void setFrutas(Integer id, String nombre){
        HashMap<Integer, String> nuevaComida = new HashMap<>();
        nuevaComida.put(id, nombre);
        
        JSONArray data = new JSONArray(nuevaComida);
        supabase.from("frutas").insert(data);
    }
}
