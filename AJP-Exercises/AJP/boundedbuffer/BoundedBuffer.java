// *****************************************************************************
// File name  : BoundedBuffer.java.
// Start date :
// Programmer : Hans So.
// Java       : Java
// Description: Bounded buffer as a subclass of circular array queue;
//              implemented as a monitor with condition synchronization
// *****************************************************************************

package boundedbuffer;

public class BoundedBuffer extends QueueAsCircularArray
{

  public BoundedBuffer(int size)
  {
    super(size);
  }

  public synchronized void put (Object x)
  {
    while (super.isFull ())
    { // wait, until not full
      try { wait (); }
      catch (InterruptedException e) {}
    }
    // now not full
    super.put (x);

    // notify: an object has been put on buffer
    notifyAll ();
  }

  public synchronized Object take ()
  {
    while (super.isEmpty ())
    { // wait, until not empty
      try { wait (); }
      catch (InterruptedException e) {}
    }
    // now not empty
    Object x = super.take ();

    // notify: an object has been taken from buffer
    notifyAll ();

    return x;
  }

  public synchronized int count ()
  {
    return super.count ();
  }

  public synchronized boolean isEmpty ()
  {
    return super.isEmpty ();
  }

  public synchronized boolean isFull ()
  {
    return super.isFull ();
  }
}
