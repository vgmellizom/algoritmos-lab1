#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

int main( )
{
    int x, y, z, cont, n;
    scanf( "%u", &n );
    x = 0;
    y = 1;
    if (n == 0)
    {
        printf ("%i", x);
        system( "pause" );
        return 0;
    }
    else if (n == 1)
    {
        printf( "%i", y );
        system( "pause" );
        return 0;
    }
    for( cont = 2; cont <= n; cont++ )
    {
        if( ( x > 0 ) && ( y > INT_MAX - x ) )
        {
            printf( "Overflow at %i", cont );
            system( "pause" );
            return 0;
        }
        z = x + y;
        x = y;
        y = z;
    }
    printf ("fibonacci %i: %i\n", n, z);
    system( "pause" );
    return 0;
}