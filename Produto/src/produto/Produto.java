package produto;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Produto {

    String nomeproduto = "";
    String marca = "";
    int quantidade;
    double preco, desconto, total, totaldesc;

    DecimalFormat num = new DecimalFormat("0.00");

        void lerProduto() {
        System.out.print("Informe o produto: ");
        Scanner prod = new Scanner(System.in);
        nomeproduto = prod.nextLine();
    }
      
    void lerMarca() {
        System.out.print("Informe a marca: ");
        Scanner marc = new Scanner(System.in);
        marca = marc.nextLine();
    }

    void preço() {
        System.out.print("Informe o preço: ");
        Scanner val = new Scanner(System.in);
        preco = val.nextDouble();
    }

    void quantidade() {
        System.out.print("Informe a quantidade: ");
        Scanner x = new Scanner(System.in);
        quantidade = x.nextInt();
    }

        double getTotal() {
        return this.total = this.quantidade * this.preco;

    }
    
//      public double getTotal(){
//           total();
//           return this.total;
//       }
       

    void lerdesconto() {
        if (this.quantidade <= 5) {
            this.desconto = (this.total * 2) / 100;
        } else if (this.quantidade > 5 && this.quantidade <= 10) {
            this.desconto = (this.total * 3) / 100;
        } else if (this.quantidade > 10) {
            this.desconto = (this.total * 5) / 100;
        }
        System.out.println(this.desconto);
    }

        void totalpagar() {
        this.totaldesc = this.total - this.desconto;
    }
   

        void imprimir() {
        System.out.println("Produto: " + this.nomeproduto);
        System.out.println("Marca: " + this.marca);
        System.out.println("Preço Unitário: " + num.format(this.preco));
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Valor do Desconto: " + num.format(this.desconto));
        System.out.println("Total: " + num.format(this.total));
        System.out.println("Total a pagar: " + num.format(this.totaldesc));

    }
    
    
}
