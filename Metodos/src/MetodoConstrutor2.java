
public class MetodoConstrutor2 {
    
    private String nome;
    private String cor;
    private String profissao;
    private int idade;
    
    public MetodoConstrutor2(String n, String c, String p, int i){
        this.nome=n;
        this.cor=c;
        this.profissao=p;
        this.idade=i;
    }
    
    public String toString(){
        return "Nome: "+this.nome+", "+"Cor: "+this.cor+", "+"Profissão: "+this.profissao+", "+"Idade: "+this.idade;
    }
    
    
}
