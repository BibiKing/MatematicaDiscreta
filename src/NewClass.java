
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
        System.out.println("Conjunto A:");
        a.imprimir();
        System.out.println("--");
        System.out.println("Conjunto B:");
        b.imprimir();
        System.out.println("--");
        System.out.println("Conjunto C:");
        c.imprimir();
        System.out.println("--");
      
        
        System.out.println("--");
        System.out.println("Tamanho A: "+a.tamanho());
        System.out.println("Tamanho B: "+b.tamanho());
        System.out.println("--");
        System.out.println("Elemento 3 de A: "+a.elemento(3));
        System.out.println("Elemento 4 de B: "+b.elemento(4));
        System.out.println("--");
        System.out.println("A contém seg?: "+a.contemElemento("seg"));
        System.out.println("B contém 5?: "+b.contemElemento(5));
        System.out.println("B contém 9?: "+b.contemElemento(9));
        System.out.println("--");
        System.out.println("B está contido em C?: "+b.estaContido(c));
        System.out.println("C está contido em B?: "+c.estaContido(b));
        System.out.println("--");
        System.out.println("Uniao de A com C");
        Conjunto AuniaoC = a.uniao(c);
        AuniaoC.imprimir();
        System.out.println("--");
        System.out.println("Intersecao B com C");
        Conjunto BintersecaoC = b.intersecao(c);
        BintersecaoC.imprimir();
        System.out.println("Intersecao A com B");
        Conjunto AintersecaoB = a.intersecao(b);
        AintersecaoB.imprimir();
        System.out.println("--");
        System.out.println(" Diferença B com C");
        Conjunto BdiferencaC = b.diferenca(c);
        BdiferencaC.imprimir();
        System.out.println(" Diferença A com C");
        Conjunto AdiferencaC = a.diferenca(c);
        AdiferencaC.imprimir();
        System.out.println("--");
        System.out.println("Produto Cartesiano");
        System.out.println(" Produto Cartesiano de A com C");
        Conjunto AprodutoC = a.produtoCartesiano(c);
        AprodutoC.imprimir();
        System.out.println(" Produto Cartesiano de B com C");
        Conjunto BprodutoC = b.produtoCartesiano(c);
        BprodutoC.imprimir();
        System.out.println(" Produto Cartesiano de C com C");
        Conjunto CprodutoC = c.produtoCartesiano(c);
        CprodutoC.imprimir();
        System.out.println("--");

        
        
    }
}
