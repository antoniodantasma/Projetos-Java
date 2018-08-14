
package banco;


public class Conta {
   
    int numero;
    String titular;
    double saldo;
    
    
    void saca(double quantidade){
        
        double novosaldo = this.saldo-quantidade;
        this.saldo=novosaldo;
    }
    
    void deposita (double quantidade){
        this.saldo+=quantidade;
    }
    
    boolean saca2(double valor){
        if(this.saldo<valor){
            return false;
        }else{
            this.saldo=this.saldo-valor;
            return true;
        }
        
      
    }
        
    public static void main(String[] args) {
        
        //Criando a conta
        Conta minhaConta;
        minhaConta = new Conta();
        
        Conta minhaConta2;
        minhaConta2 = new Conta();
        minhaConta2.saldo=15000;
        
        //Alterando os valores de minha conta.
        minhaConta.titular = "Duke";
        minhaConta.saldo = 1000;
        
        //Saca 200 reais
        minhaConta.saca(200);
        
        //Deposita 500 reais
        minhaConta.deposita(500);
        
        
        System.out.println("Saldo atual: "+minhaConta.saldo);
        
    }
    
}
