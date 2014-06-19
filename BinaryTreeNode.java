
public class BinaryTreeNode<T extends Comparable<T>> implements Comparable<T> {
	
	private T value;
	private BinaryTreeNode<T> left;
	private BinaryTreeNode<T> right;
	
	public BinaryTreeNode(T val){
		this.value=val;
	}
	
	public T getValue() {
		return value;
	}

	public BinaryTreeNode<T> getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode<T> left) {
		this.left = left;
	}

	public BinaryTreeNode<T> getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode<T> right) {
		this.right = right;
	}

	@Override
	public int compareTo(T val) {
		return this.value.compareTo(val);
	}
}
