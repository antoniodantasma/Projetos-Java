import java.util.Scanner;
import java.text.DecimalFormat;


public class Combustivel {

    
    int kmtotal,tanque,qtdpessoas,kmpl;
    double preco,valortotal,valorpessoa;

DecimalFormat formatar = new DecimalFormat("0,00");


public void informar(){
    
System.out.println("Informe a quilometragem: ");
Scanner k = new Scanner(System.in);
this.kmtotal=k.nextInt();

System.out.println("Informe qual o consumo do carro por litro:");
this.kmpl=k.nextInt();

System.out.println("Informe o volume do tanque: ");
this.tanque=k.nextInt();

System.out.println("Informe o preço do combustível: ");
this.preco=k.nextDouble();

System.out.println("Informe a quantidade de pessoas no veículo: ");
this.qtdpessoas=k.nextInt();

    System.out.println();
}

public void calcular(){

//tcons é tanque consumido.
int tcons=tanque/2;
this.valortotal=tcons*this.preco;
this.valorpessoa=this.valortotal/this.qtdpessoas; 

}
    
public void imprimir(){
    calcular();
    System.out.println(formatar.format(valorpessoa));
    
}

}

   

