
package gravação;

import java.util.Scanner;
import java.io.*;

public class GravandoAcessandoArquivos {
    
    public static void main(String[] args) throws Exception {
        
        Scanner x = new Scanner(System.in);
        
        //OutputStream aponta para o arquivo a ser criado.
        //FileImputStream representa Stream de entrada.
        OutputStream out = new FileOutputStream ("C:\\Users\\Dantas\\Documents\\ArquivoNetbeans.txt");        
        
        //Texto a ser gravado no arquivo.
        System.out.println("Digite um texo");
        String texto = x.nextLine();
        
        //criando o buffer com array de bytes utilizando o método getBytes.
        byte[] buffer = texto.getBytes();
        
        out.write(buffer); //Método write para escrever o array de bytes em um arquivo.
        out.close(); //fecha o stream.
        
        System.out.println("texto gravado com sucesso!!");
        
        //----------------------------------------------------
        
        //InputStream, stream de entrada, lê os dados do arquivo passado como parâmetro.
        //FileInputStream representa stream de entrada.
        InputStream in = new FileInputStream ("C:\\Users\\Dantas\\Documents\\ArquivoNetbeans.txt");
        
        byte [] buffer2 = new byte[500];// array de 500 bytes
        
        in.read(buffer2); // o método read faz a leitura dos dados da stream e coloca esses dados 
                          // em um array  de bytes, que é um buffer (memória temporária).
                          
        String texto2 = new String(buffer2); //criando uma string a partir de uma array de bytes.
        
        System.out.println();
        System.out.println("Exibindo o testo gravado");
        System.out.println(texto2);
        
        
        
        
    }
    
}
