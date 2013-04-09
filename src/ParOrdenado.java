import java.util.ArrayList;
import java.util.List;

public class ParOrdenado <T extends Comparable<T>> {
    List<T> elementos;
    
    public ParOrdenado(){
        elementos = new ArrayList(2);
    }
    
    public ParOrdenado(T i, T j){
        this();
        elementos.add(i);
        elementos.add(j);        
    }
    
    public void definir(T i, T j){
        elementos.clear();
        elementos.add(i);
        elementos.add(j);
    }
    
    @Override
    public String toString(){
        return "("+elementos.get(0)+", "+elementos.get(1)+")";
    }
}
