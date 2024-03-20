package beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class e1008 {

    public static void main(String[] args) throws IOException {
    
    Scanner scan = new Scanner (System.in);

    int nmr = scan.nextInt(), hrs = scan.nextInt();
    double valor_hora = scan.nextDouble();

    scan.close();

    double salário = hrs * valor_hora;

    System.out.printf("NUMBER = %d \nSALARY = U$ %.2f\n", nmr, salário);

    }

    
}
