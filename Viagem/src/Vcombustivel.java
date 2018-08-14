
import java.util.Scanner;
import java.util.InputMismatchException;

public class Vcombustivel {

    public static void main(String[] args) {

        int op = 0;

        Scanner x = new Scanner(System.in);
        Combustivel ver = new Combustivel();

        while (op != 2) {
            System.out.println();
            System.out.println("*** App de Carona ***");
            System.out.println("1 - Iniciar");
            System.out.println("2 - Sair");
            System.out.println("Digite a opção: ");
            try {
                op = x.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Exceção - Digitou Texto");
                System.out.println(e.getMessage());
                break;
            }
            switch (op) {

                case 1:
                    ver.informar();
                    ver.calcular();
                    ver.imprimir();

                    break;
                default:
                    System.out.println("Saindo");

            }
        }

    }

}
