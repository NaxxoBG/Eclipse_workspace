/*
 * 19.03.2014 Original version
 */


package dk.via.jpe.heapsort;


public class TryHeapSort
{
	public static void main( String[] args )
	{
		Integer[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		HeapSort.sort( a );
		
		for( int i = 0; i < a.length; ++i )
			System.out.print( " " + a[i] );
		System.out.println();
		
		Integer[] b = { 8, 2, 6, 1, 9, 4, 3, 10, 5, 7 };

		HeapSort.sort( b );
		
		for( int i = 0; i < b.length; ++i )
			System.out.print( " " + b[i] );
		System.out.println();
		
		Integer[] c = new Integer[1000];
		
		// create 1000 different values c
		c[0] = 264;
		for( int i = 1; i < c.length; ++i )
			c[i] = ( c[i-1] + 510 ) % c.length + 1;

		HeapSort.sort( c );
		
		for( int i = 0; i < c.length; ++i )
			System.out.print( " " + c[i] );
		System.out.println();
	}
}
