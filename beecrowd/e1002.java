package beecrowd;

import java.io.IOException;
import java.util.Scanner;
 
public class e1002 {
 
    public static void main(String[] args) throws IOException {
 
    final double PI = 3.14159;
    
    Scanner scan = new Scanner(System.in);
    double R = scan.nextDouble();

    double A = PI * (R*R);

    scan.close();
    
    System.out.printf("A=%.4f\n", A);

    }
 
}