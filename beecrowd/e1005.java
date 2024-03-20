package beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class e1005 {
    
    public static void main(String[] args) throws IOException {

    Scanner scan = new Scanner (System.in);
 
    double A = scan.nextDouble(), B = scan.nextDouble(), Media;

    scan.close();

    Media = (A* 3.5 + B*7.5)/11; 

    System.out.printf("MEDIA = %.5f\n", Media);


    }
 
    
}
