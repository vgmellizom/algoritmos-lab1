#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

int main( )
{
    long x, y, z, cont, n;
    scanf( "%li", &n );
    x = 0;
    y = 1;
    if (n == 0)
    {
        printf ("%li", x);
        system( "pause" );
        return 0;
    }
    else if (n == 1)
    {
        printf( "%li", y );
        system( "pause" );
        return 0;
    }
    for( cont = 2; cont <= n; cont++ )
    {
        if( ( x > 0 ) && ( y > LONG_MAX - x ) )
        {
            printf( "Overflow at %li", cont );
            system( "pause" );
            return 0;
        }
        z = x + y;
        x = y;
        y = z;
    }
    printf ("fibonacci %li: %li\n", n, z);
    system( "pause" );
    return 0;
}