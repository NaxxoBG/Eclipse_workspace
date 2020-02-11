/*
 * 19.03.2014 Original version
 */

package dk.via.jpe.heapsort;

public class HeapSort
{
	public static <T extends Comparable<? super T>> void sort( T[] a )
	{
		heapify( a );
		
		for( int end = a.length - 1; end > 0; end-- ) {
			T temp = a[end];
			a[end] = a[0];
			a[0] = temp;
			
			reheapify( a, end );
		}
	}
	
	
	private static <T extends Comparable<? super T>> void heapify( T[] a )
	{
		for( int i = 0; i < a.length; ++i ) {
			T temp = a[i];
			int current = i;
			
			while( current > 0 && a[parentIx(current)].compareTo(temp) < 0 ) {
				a[current] = a[parentIx(current)];
				current = parentIx(current);
			}
			
			a[current] = temp;
		}
	}
	
	
	private static <T extends Comparable<? super T>> void reheapify( T[] a, int end )
	{
		T temp = a[0];
		int current = 0;
		
		for(;;)
			if( rightIx(current) < end ) {
				// current has both a left and right child
				if( a[leftIx(current)].compareTo(a[rightIx(current)]) > 0 ) {
					// left child larger than right child
					if( a[leftIx(current)].compareTo(temp) > 0 ) {
						a[current] = a[leftIx(current)];
						current = leftIx(current);
					} else {
						a[current] = temp;
						return;
					}
				} else {
					// right child larger than left child
					if( a[rightIx(current)].compareTo(temp) > 0 ) {
						a[current] = a[rightIx(current)];
						current = rightIx(current);
					} else {
						a[current] = temp;
						return;
					}
				}
			} else if( leftIx(current) < end ) {
				// current only has a left child
				if( a[leftIx(current)].compareTo(temp) > 0 ) {
					a[current] = a[leftIx(current)];
					current = leftIx(current);
				} else {
					a[current] = temp;
					return;
				}
			} else {
				a[current] = temp;
				return;
			}
	}
	
	
	private static int parentIx( int ix )
	{
		return ( ix - 1 ) / 2;
	}
	
	
	private static int leftIx( int ix )
	{
		return 2 * ix + 1;
	}
	
	
	private static int rightIx( int ix )
	{
		return 2 * ix + 2;
	}
}
