import java.util.Scanner;

/**
 * Entrada_forma_inversa
 */
public class Entrada_forma_inversa {

    public static void main(String[] args) {

        int[] array = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        array[0] = sc.nextInt();

        System.out.println("Digite um numero: ");
        array[1] = sc.nextInt();

        System.out.println("Digite um numero: ");
        array[2] = sc.nextInt();

        System.out.println("Digite um numero: ");
        array[3] = sc.nextInt();

        System.out.println("Digite um numero: ");
        array[4] = sc.nextInt();

        System.out.println("Digite um numero: ");
        array[5] = sc.nextInt();

        System.out.println("Digite um numero: ");
        array[6] = sc.nextInt();

        System.out.println("Digite um numero: ");
        array[7] = sc.nextInt();

        System.out.println("Digite um numero: ");
        array[8] = sc.nextInt();

        System.out.println("Digite um numero: ");
        array[9] = sc.nextInt();

        for(int i = (array.length)-1; i < 10 ; i--){

            System.out.println(array[i]);
        }

    }
}
