package java8;

import java.util.Objects;

public class Node {
	private int value;
	private Node node;
	
	public Node(int value, Node node) {
		this.value = value;
		this.node = node;
	}
	
	public Node(int value) {
		this.value = value;
		this.node = null;
	}

	public Node getNext() {
		return Objects.isNull(node) ? null : node;
	}

	
	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", node=" + node + "]";
	}
}
