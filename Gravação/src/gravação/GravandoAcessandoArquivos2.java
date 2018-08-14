
package gravação;

import java.util.Scanner;
import java.io.*;


public class GravandoAcessandoArquivos2 {
    
    public static void main(String[] args) throws Exception{
        
        Scanner x = new Scanner(System.in);
        
        OutputStream arq = new FileOutputStream("C:\\Users\\Dantas\\Documents\\MeuArquivoCriado.txt");
        
        System.out.println("Digite o texto");
        
       String texto = x.nextLine();
       
       byte[] buffer = texto.getBytes();
       
       arq.write(buffer);
       arq.close();
       
       //---------------------------------------------------------
       
       InputStream ler = new FileInputStream("C:\\Users\\Dantas\\Documents\\MeuArquivoCriado.txt");
       
       byte [] folha = new byte[500];
       
       ler.read(folha);
       
       String texto2 = new String(folha);
       
        System.out.println();
        System.out.println("O texto digitado foi");
        System.out.println(texto2);
       
       
       
       
       
       
        
    }
    
}
