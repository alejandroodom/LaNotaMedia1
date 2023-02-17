import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduzca el número de valores:");
        int numValores = input.nextInt();

        double suma = 0;
        for (int i = 0; i < numValores; i++) {
            System.out.println("Valor " + (i+1) + ":");
            double valor = input.nextDouble();
            suma += valor;
        }

        double media = suma / numValores;
        System.out.println("La media es " + media);
    }
}