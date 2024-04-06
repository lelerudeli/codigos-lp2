package beecrowd;

import java.util.Scanner;

public class e1019 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        scan.close();

        int s, m, h = 0;

        h = N /3600;
        m = (N % 3600) / 60;
        s = (N % 3600) % 60;

        System.out.println(h + ":" + m + ":" + s);

    }
    
}
