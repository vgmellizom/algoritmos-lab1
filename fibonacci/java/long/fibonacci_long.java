import java.util.Scanner;
import java.lang.*;

public class MyClass {
    public static void main(String args[]) {

        long x, y, z, cont, n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt( );
        x = 0;
        y = 1;
        z = 0;
        if (n == 0)
        {
            System.out.println(x + "\n");
            System.exit(0);
        }
        else if (n == 1)
        {
            System.out.println(y + "\n");
            System.exit(0);
        }
        for( cont = 2; cont <= n; cont++ )
        {
            if( ( x > 0 ) && ( y > Long.MAX_VALUE - x ) )
            {
                System.out.println("Overflow at: " + cont + "\n");
                System.exit(0);
            }
            z = x + y;
            x = y;
            y = z;
        }
        System.out.println("fibonacci " + n + ": " + z);
        System.exit(0);
    }
}