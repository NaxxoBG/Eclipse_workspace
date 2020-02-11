// *****************************************************************************
// File name  : IQueue.java.
// Start date :
// Programmer : Hans So.
// Java       :
// Description: Interface IQueue describes a protocol for a Queue of Objects
// *****************************************************************************



/**
 * This <CODE>interface IQueue</CODE> specifies the ADT Queue.
 * @version 1.0; - 5th October 2004
 * @author Hans Sondergaard
 */
public interface IQueue
{
	/**
	 * Adds an element to the rear of the queue.
     * <PRE>
     * <B>Precondition: </B>
     *      The queue is not full
     * <B>Postcondition: </B>
     *      The queue is not empty
     * </PRE>
	 * @param x is not null
	 */
	void put (Object x);

	/**
	 * Removes an element from the front of the queue.
     * <PRE>
     * <B>Precondition: </B>
     *      The queue is not empty
     * <B>Postcondition: </B>
     *      The queue is not full
     * </PRE>
	 * @return removes the object in front of the queue and returns it
	 */
	Object take ();

	/**
	 * Determines if the queue is empty.
	 * @return true, if queue is empty, otherwise false
	 */
	boolean isEmpty ();

	/**
	 * Determines if the queue is full.
	 * @return true, if queue is full, otherwise false
	 */
	boolean isFull ();

	/**
	 * Determines the number of elements in the queue.
	 * @return the number of objects in the queue
	 */
	int count ();
}
