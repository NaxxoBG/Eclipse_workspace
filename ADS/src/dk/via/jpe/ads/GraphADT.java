/**
 * An implementation of the graph ADT (reworked from Lewis&Chase)
 * 
 * 09.11.2016 Original version
 */

package dk.via.jpe.ads;


import java.util.Iterator;

/**
 * An implementation of the graph abstract data type
 *
 * @param <T> Generic type of objects stored in the vertices of the graph
 */

public interface GraphADT<T>
{
	/**
	 * Add a vertex to the graph
	 * 
	 * @param vertex Value to be stored in the vertex
	 * @return 
	 */
	
	public void addVertex( T vertex );

	/**
	 * Remove a vertex from the graph
	 * 
	 * @param vertex Value of the vertex to be removed
	 */
	
	public void removeVertex( T vertex );

	/**
	 * Add an edge between two vertices 
	 * 
	 * @param vertex1 Start vertex of the edge
	 * @param vertex2 End vertex of the edge
	 */
	
	public void addEdge( T vertex1, T vertex2 );

	/**
	 * Removes an edge from the graph
	 * 
	 * @param vertex1 Start vertex of the edge
	 * @param vertex2 End vertex of the edge
	 */
	
	public void removeEdge( T vertex1, T vertex2 );

	/**
	 * Create an iterator for a breadth first traversal of the graph
	 * 
	 * @param startVertex The start vertex of the traversal
	 * @return            The created iterator
	 */
	
	public Iterator<T> iteratorBFS( T startVertex );

	/**
	 * Create an iterator for a depth first traversal of the graph
	 * 
	 * @param startVertex The start vertex of the traversal
	 * @return            The created iterator
	 */
	
	public Iterator<T> iteratorDFS( T startVertex );

	/**
	 * Create an iterator for the shortest path between two vertices
	 * 
	 * @param startVertex  The start vertex of the traversal
	 * @param targetVertex The end vertex of the traversal
	 * @return             The created iterator
	 */
	
	public Iterator<T> iteratorShortestPath( T startVertex, T targetVertex );

	/**
	 * Returns if the graph is empty or not
	 * 
	 * @return True if the graph contains no vertices
	 */
	
	public boolean isEmpty();

	/**
	 * Returns if the graph is connected or not
	 * 
	 * @return True if the graph is connected
	 */
	
	public boolean isConnected();

	/**
	 * Returns the size of the graph
	 * 
	 * @return The number of vertices in the graph
	 */
	public int size();
}
