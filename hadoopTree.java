package InternIntPractice;

import java.util.*;

public class hadoopTree<T> {
	
	
	private static class TreeNode<T> {
	    T item;
	    List<TreeNode<T>> childNodes;

	    public TreeNode(T item, List<TreeNode<T>> childNodes) {
	        this.item = item;
	        this.childNodes = childNodes;
	    }
	}
	
	private TreeNode<T> root;

	/**
	 * Constructs a tree with given branching factor (n-ary).
	 * The integer arrays, which is specified in the BFS order.
	 * For example, the children of the current node are
	 * in position "nary * i + k" in the array, where i is the position of the current / parent node.
	 * n-ary (nary) is the branching factor and k is the kth / count of the child.
	 * 
	 * @param items     the list of items, to be parsed according to branching factor.
	 * @param nary      n-ary, the branching factor.
	 */
	public hadoopTree(T[] items, int nary) {
		if (nary <= 0) throw new NullPointerException("The branching factor : " + nary + ", should be greater than zero.");
		constructTree(items, nary);
	}

	private void constructTree(T[] items, int nary) {
		root = new TreeNode<T>(items[0], new ArrayList<TreeNode<T>>(nary));

		final Queue<TreeNode<T>> nodeQueue = new LinkedList<TreeNode<T>>();
		nodeQueue.add(root);

		for (int i = 0; i < (items.length / nary); i++) {
			if (items[i] != null) {
				final TreeNode<T> node = nodeQueue.poll();

				for (int k = 1; k <= nary; k++) {
					if (items[nary * i + k] != null) {
						TreeNode<T> childNode = new TreeNode<T>(items[nary * i + k], new ArrayList<TreeNode<T>>(nary));
						nodeQueue.add(childNode);
						node.childNodes.add(childNode);
					}
				}
			}
		}
	}
	
	/*void display(hadoopTree<T> t)
	{
	    Iterator<hadoopTree> IT = t.nary_list.iterator();
	    if(!(IT.hasNext()))   //If the node does not  have any children, enter.
	    {
	    //    System.out.println("No more childs of this node");
	        System.out.print( t.data + " ");
	        return;
	    }

	    while(IT.hasNext()){
	        display(IT.next()) ;            //Recursive Call
	    }

	   System.out.print(t.data + " ");
	}

	public static void main(String[] args) {
		/*
		 * 1 / | \ 2 3 4 / | | \ 5 6 8 10
		 * 
		 */
		Integer[] m1 = { 1, 2, 3, 4, 5};
		//hadoopTree<Integer> sian2 = new hadoopTree<Integer>(m1, 4);
		
	}
//}