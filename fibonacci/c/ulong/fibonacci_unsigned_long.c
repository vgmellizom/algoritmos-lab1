#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

int main( )
{
    unsigned long long x, y, z, cont, n;
    scanf( "%llu", &n );
    x = 0;
    y = 1;
    if (n == 0)
    {
        printf ("%llu", x);
        system( "pause" );
        return 0;
    }
    else if (n == 1)
    {
        printf( "%llu", y );
        system( "pause" );
        return 0;
    }
    for( cont = 2; cont <= n; cont++ )
    {
        if( ( x > 0 ) && ( y > ULONG_MAX - x ) )
        {
            printf( "Overflow at %llu", cont );
            system( "pause" );
            return 0;
        }
        z = x + y;
        x = y;
        y = z;
    }
    printf ("fibonacci %llu: %llu\n", n, z);
    system( "pause" );
    return 0;
}