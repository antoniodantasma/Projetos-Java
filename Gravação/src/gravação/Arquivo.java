
package gravação;

import java.util.Scanner;
import java.io.*;


public class Arquivo {
    
    public void GravarArquivo(){
        try{
            Scanner x = new Scanner (System.in);
            OutputStream arq = new FileOutputStream("C:\\Users\\Dantas\\Documents\\ArquivoCriado.txt");
            
            System.out.println("Digite o texto");
            String texto = x.nextLine();
            byte[] buffer = texto.getBytes();
            
            arq.write(buffer);
            arq.close();
            
        }catch(IOException e){
            System.out.println("Entrada Inválida");
            System.out.println(e.getMessage());
            
        }
      
    }
    
    public void lerArquivo(){
            try{
                InputStream arq = new FileInputStream("C:\\Users\\Dantas\\Documents\\ArquivoCriado.txt");
                
                byte[] buffer2 = new byte[500];
                arq.read(buffer2);
                
                String texto = new String (buffer2);
                
                System.out.println();
                System.out.println("Você digitou o seguinte texto");
                System.out.println(texto);  
                }catch(IOException e){
                    System.out.println("Leitura Inválida");
                    System.out.println(e.getMessage());
            
        }
        }
    
}
