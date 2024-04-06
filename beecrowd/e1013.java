package beecrowd;

import java.io.IOException;
import java.util.Scanner;


public class e1013 {
    
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int v1 = scan.nextInt();
        int v2 = scan.nextInt();
        int v3 = scan.nextInt();

        scan.close();

        int maiorV1V2 = (v1 + v2 + Math.abs(v1-v2))/  2;

        if(maiorV1V2 > v3)
            System.out.println(maiorV1V2 + " eh o maior");
        else 
            System.out.println(v3 + " eh o maior");
    }
}

