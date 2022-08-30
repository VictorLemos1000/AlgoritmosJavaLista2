import java.util.Scanner;

import javax.print.attribute.standard.Media;

/**
/// * Media_aritmetica
 */
public class Media_aritmetica {

    public static void main(String[] args) {
        
        float Numero1;
        float Numero2;
        float Numero3;
        float Numero4;
        float Numero5;
        double Resultado;

        Scanner Soma = new Scanner(System.in);
        Numero1 = Soma.nextFloat();
        Numero2 = Soma.nextFloat();
        Numero3 = Soma.nextFloat();
        Numero4 = Soma.nextFloat();
        Numero5 = Soma.nextFloat();
        Resultado = Soma.nextFloat();
        
        Resultado = (Numero1 + Numero2 + Numero3 + Numero4 + Numero5) / 5;
        System.out.println("Qual eh a media aritmetca?" + Resultado);
    }
}  