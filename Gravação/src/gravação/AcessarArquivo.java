package gravação;

import java.util.Scanner;
import java.util.InputMismatchException;

public class AcessarArquivo {

    public static void main(String[] args) {

        int op = 0;

        Arquivo obj = new Arquivo();
        Scanner x = new Scanner(System.in);

        while (op != 3 ) {

            System.out.println();
            System.out.println("1- Gravar arquivo");
            System.out.println("2- Ler Arquivo");
            System.out.println("3- Sair");
            System.out.println("Digite a opção");
            
            try {
            op = x.nextInt();
                }
            catch (InputMismatchException e) {
                System.out.println("entrada Inválida");
                System.out.println(e.getMessage());
                break;
            }

                switch (op) {

                    case 1:
                        obj.GravarArquivo();
                        break;
                    case 2:
                        obj.lerArquivo();
                        break;
                    default:
                        System.out.println("Saindo");
                }
            } 
        }

    }

