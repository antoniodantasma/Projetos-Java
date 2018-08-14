
package produto;

import java.util.Scanner;


public class TesteProduto {
    public static void main(String[] args) {
        
        Produto z = new Produto();
        
        
       
        z.lerProduto();
        z.lerMarca();
        z.quantidade();
        z.preço();
        System.out.println(z.getTotal()); 
        z.lerdesconto();
        z.totalpagar();
        System.out.println();
        z.imprimir();
        
    }
    
}
