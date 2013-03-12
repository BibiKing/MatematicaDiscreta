
import java.util.ArrayList;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BibiKing
 */
public class NewClass {
    public static void main(String[] args){
        Conjunto a = new Conjunto();
        a.adicionar("seg");
        a.adicionar("ter");
        a.adicionar("qua");
        a.adicionar("qui");
        a.adicionar("sex");
        a.adicionar("sab");
        a.adicionar("dom");
                
        Conjunto b = new Conjunto();
        b.adicionar(0);
        b.adicionar(1);
        b.adicionar(2);
        b.adicionar(3);
        b.adicionar(4);
        b.adicionar(5);
        b.adicionar(6);
        
        Conjunto c = new Conjunto();       
        c.adicionar(0);
        c.adicionar(1);
        c.adicionar(5);
        c.adicionar(6);
        
        System.out.println("--");
        System.out.println("Tamanho A: "+a.tamanho());
        System.out.println("Tamanho B: "+b.tamanho());
        System.out.println("--");
        System.out.println("Elemento 3 de A: "+a.elemento(3));
        System.out.println("Elemento 4 de B: "+a.elemento(3));
        System.out.println("--");
        System.out.println("A contém Segunda?: "+a.contemElemento("Segunda"));
        System.out.println("B contém 5?: "+b.contemElemento(5));
        System.out.println("--");
        System.out.println("B está contido em C?: "+b.estaContido(c));
        System.out.println("C está contido em B?: "+c.estaContido(b));
        System.out.println("--");
        System.out.println("Uniao de A com C");
        Conjunto AuniaoC = a.uniao(c);
            System.out.print("{ ");
        for(int i=0; i<AuniaoC.tamanho(); i++){
            System.out.print(AuniaoC.elemento(i)+";");
        }
            System.out.println("\b}");
        System.out.println("--");
        System.out.println("Intersecao ");
        System.out.println("");
        System.out.println("--");
        System.out.println("Diferenca");
        System.out.println("");
        System.out.println("--");
        System.out.println("Produto Cartesiano");
        System.out.println("");
        System.out.println("--");

        
        
    }
}
