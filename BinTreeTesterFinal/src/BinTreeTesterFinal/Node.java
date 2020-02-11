package BinTreeTesterFinal;

public class Node implements Cloneable
{
	private Node leftchild;
	private Node rightchild;
	private int key;
	private int hit;

	public Node(int key)
	{
		this.key = key;
		this.hit = 0;
	}
	
	public Node(int key, int hit) {
	   this.key = key;
	   this.hit = hit;
	}

	public String toString()
	{
		if (this.getLeftchild() != null && this.getRightchild() != null)
		{
			return "Element: " + this.key + "\nLeft child: " + this.getLeftchild().getKey() + "\nRight child: "
					+ this.getRightchild().key + "\nNumber of hits: " + this.hit + "\n\n";
		}

		if (this.getLeftchild() != null && this.getRightchild() == null)
		{
			return "Element: " + this.key + "\nLeft child: " + this.getLeftchild().getKey() + "\nRight child: " + null
					+ "\nNumber of hits: " + this.hit + "\n\n";
		}

		if (this.getLeftchild() == null && this.getRightchild() != null)
		{
			return "Element: " + this.key + "\nLeft child: " + null + "\nRight child: " + this.getRightchild().getKey()
					+ "\nNumber of hits: " + this.hit + "\n\n";
		}

		if (this.getLeftchild() == null && this.getRightchild() == null)
		{
			return "Element: " + this.key + "\nLeft child: " + null + "\nRight child: " + null + "\nNumber of hits: "
					+ this.hit + "\n\n";
		}

		return "";
	}

	public int getHit()
	{
		return hit;
	}

	public Node getLeftchild()
	{
		return leftchild;
	}

	public Node getRightchild()
	{
		return rightchild;
	}

	public int getKey()
	{
		return key;
	}

	public void setLeftchild(Node leftchild)
	{
		this.leftchild = leftchild;
	}

	public void setRightchild(Node rightchild)
	{
		this.rightchild = rightchild;
	}

	public void setKey(int key)
	{
		this.key = key;
	}

	public void setHit(int hit)
	{
		this.hit = hit;
	}

	public void incHit()
	{
		this.hit++;
	}
	

   @Override
   protected Object clone() throws CloneNotSupportedException {
       return super.clone();
   }
}