
package Modelo;



import Vista.Menu;
import java.util.HashMap;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import org.json.JSONArray;
import org.json.JSONObject;
import supabase.Filter;
import supabase.Supabase;
/**
 *
 * @author Santiago Jose Salgado Lopez
 */
public class BaseDeDatos {
    private static String tipo = "tipo";
    private static String nombre_frutas;
    private static String frutasLeidas = "";
    public Menu menu;
    public static Supabase supabase = new Supabase("https://igqbxxueeykbojmdcayu.supabase.co/"
        , "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImlncWJ4eHVlZXlrYm9qbWRjYXl1Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3MjMxNDI0NzksImV4cCI6MjAzODcxODQ3OX0.O21UGn-f8uXpiE7qiVc0tfqBfD-bIxRhabEpLYFgiQg");
    

    public static void login(){
        supabase.auth.LoginWithEmailAndPassword("sasalgadol@unal.edu.co", "clavesupabase");
    }

    public static String[] getNameFrutas(String tabla) {
        
        JSONArray consultaTipo = supabase.from(tabla).select("nombre_frutas", new Filter(tipo,"eq", "fruta"));
        Fruta[] arregloFrutas = new Fruta[consultaTipo.length()];
        for(int i = 0; i < consultaTipo.length() ; i++){
            JSONObject objetosConsulta = consultaTipo.getJSONObject(i);
            
            System.out.println(objetosConsulta);
            frutasLeidas = objetosConsulta.getString("nombre_frutas");
            
            
            String tipoTemporal = "";
            arregloFrutas[i] = new Fruta(frutasLeidas, tipoTemporal);
            
        }
        String[] nameFrutas = new String[arregloFrutas.length];
        Integer contador = 0;
        for (Fruta arreglo : arregloFrutas) {
            nameFrutas[contador] = arreglo.getNombre();
            contador++;
            System.out.println(nameFrutas);
        } 
       
    
        return nameFrutas;
    }
   

    
    
    public static void setFrutas(Integer id, String nombre){
        HashMap<Integer, String> nuevaComida = new HashMap<>();
        nuevaComida.put(id, nombre);
        
        JSONArray data = new JSONArray(nuevaComida);
        supabase.from("frutas").insert(data);
    }
}
