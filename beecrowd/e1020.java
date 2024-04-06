package beecrowd;

import java.util.Scanner;

public class e1020 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        scan.close();

        int a, m, d = 0;

        a = i / 365;
        m = (i % 365) /30;
        d = (i % 365) % 30;

        System.out.println(a + " ano(s)\n" + m + " mes(es)\n" +  d + " dia(s)");
    }
}
