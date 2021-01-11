package simbolos;
import java.util.*; 
import analizadorLexico.*; 
import inter.*;
/**
 *
 * @author Joel
 */
public class Ent {
    private HashMap tabla;
    protected Ent ant;
    public Ent(Ent n) { tabla = new HashMap(); ant = n; }
    public void put(Token w, Id i) { tabla.put(w, i); }
    public Id get(Token w) {
        for( Ent e = this; e != null; e = e.ant ) {//coregimos el env por ent
            Id encontro = (Id)(e.tabla.get(w));
            if( encontro != null ) return encontro;
        }
        return null;
     }
}
