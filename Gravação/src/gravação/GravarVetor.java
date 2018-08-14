package gravação;

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class GravarVetor {

    public void escreverNumeros() {

        try {
            OutputStream arq = new FileOutputStream("C:\\Users\\Dantas\\Documents\\NumerosVetor.txt");
            Scanner ler = new Scanner(System.in);

            String vetor[] = new String [10];
            for (int i = 0; i < vetor.length; i++) {
                int y = i + 1;
                System.out.println("Digite o " + y + "º valor");
                vetor[i] = ler.nextLine();

                byte[] valor = vetor[i].getBytes();

                arq.write(valor);
               
                y++;
            }

        } catch (IOException e) {
            System.out.println("Valor Inválido");
            System.out.println(e.getMessage());

        }

    }

    public void lerNumeros() {

        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            try {

                InputStream arq = new FileInputStream("C:\\Users\\Dantas\\Documents\\NumerosVetor.txt");

                byte[] buffer = new byte[20];

                arq.read(buffer);
                String texto = new String(buffer);
                System.out.println();
                System.out.println("Os valores digitados são: ");
                System.out.println(texto);
                break;
            } catch (IOException e) {
                System.out.println("Valor Inválido");
                System.out.println(e.getMessage());
            }
        }

    }

}
