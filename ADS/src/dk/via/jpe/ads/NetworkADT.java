/**
 * An implementation of the network ADT (reworked from Lewis&Chase)
 * 
 * 09.11.2016 Original version
 */

package dk.via.jpe.ads;

/**
 * An implementation of the network abstract data type
 *
 * @param <T> Generic type of objects stored in the vertices of the network
 */

public interface NetworkADT<T>
	extends GraphADT<T>
{
	/**
	 * Add an edge to the network
	 * 
	 * @param vertex1 Start vertex of the edge
	 * @param vertex2 End vertex of the edge
	 * @param weight  Weight of edge
	 */
	
	public void addEdge( T vertex1, T vertex2, double weight );
 
	/**
	 * Finds the length of the shortest path between two vertices
	 * 
	 * @param vertex1 Start of path
	 * @param vertex2 End of path
	 * 
	 * @return        Returns the sum of weights of the edges of the path
	 */
	
	public double shortestPathWeight( T vertex1, T vertex2 );
}
