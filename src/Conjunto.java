
import java.util.ArrayList;
import java.util.List;

public class Conjunto <T extends Comparable>{
    List<T> elementos;
    
    public Conjunto(){
        this.elementos = null;
    }
    
    public Conjunto(List<T> elementos){
        this.elementos.addAll(elementos);
    }
    
    public void adicionar(T e){

           this.elementos.add(e); 
       
    }
    
    public void adicionarTodos(List<T> l){
        if(elementos == null){
            elementos = l;
        }else {
           this.elementos.addAll(l); 
        }    
           
    }
    
    public int tamanho(){
        return elementos.size();
    }
    
    public T elemento(int i){
        return elementos.get(i);
    }
    
    public boolean contemElemento(T e){
        for(T elemento: elementos){
            if(elemento.compareTo(e) == 0){
                return true;
            }
        }    
        return false;        
    }
    
    public boolean estaContido(Conjunto C){
        for(T elemento: elementos){
            if(!C.contemElemento(elemento)){
                return false;
            }
        }
        return true;
    }
    
    public Conjunto uniao(Conjunto conj){
        Conjunto uniao = new Conjunto(elementos);
        
        for(int i=0; i<conj.tamanho(); i++){
            if( !uniao.contemElemento( conj.elemento(i) )){
                uniao.adicionar(conj.elemento(i));
            }
        }
        
        return uniao;        
    }
    
    public Conjunto intersecao(Conjunto conj){
        Conjunto intersecao = new Conjunto();
        
        for(int i=0; i<conj.tamanho(); i++){
            if( this.contemElemento((T) conj.elemento(i))){
                intersecao.adicionar(conj.elemento(i));
            }
        }
        
        return intersecao;
        
    }
    
    public Conjunto diferenca(Conjunto conj){
        Conjunto diferenca = new Conjunto();
        
        for(int i=0; i<conj.tamanho(); i++){
            if( !this.contemElemento((T) conj.elemento(i))){
                diferenca.adicionar(conj.elemento(i));
            }
        }
        
        for(int i=0; i<this.tamanho(); i++){
            if( !conj.contemElemento(this.elemento(i))){
                diferenca.adicionar(this.elemento(i));
            }
        }
        
        return diferenca;
        
    }
     
    public Conjunto produtoCartesiano(Conjunto conj) {
        Conjunto produtoCartesiano = new Conjunto();
        
        for(int i=0; i<this.tamanho(); i++){
            for(int j=0; j<conj.tamanho(); j++){
                List<T> e = new ArrayList(2);
                
                e.add( (T) this.elemento(i) );
                e.add( (T) conj.elemento(j));
                
                produtoCartesiano.adicionar((Comparable) e);
            }
        }
        
        return produtoCartesiano;
    } 

}
