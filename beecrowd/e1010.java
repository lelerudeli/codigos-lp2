package beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class e1010 {
    
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int p1 = scan.nextInt();
        int n1 = scan.nextInt();
        double  valor = scan.nextDouble();

        int p2 = scan.nextInt();
        int n2 = scan.nextInt();
        double valor2 = scan.nextDouble();

        scan.close();

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", (n1*valor + n2*valor2));
    
    }
}
