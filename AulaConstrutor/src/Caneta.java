
public class Caneta {
    
    private String marca;
    private String cor;
    private float ponta;
    private boolean tampada=true;

    public Caneta(String M, String c, float p) {    // É um método construtor.
        this.marca = M;
        this.cor = c;
        this.ponta = p;
        this.isTampada();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
  
   public void status(){
       
       System.out.println("A marca é: " + this.getMarca());
       System.out.println("A cor é: " + this.getCor());
       System.out.println("A ponta é: " + this.getPonta());
       System.out.println("A caneta está tampada? " + this.tampada);
       
   }
   
}
