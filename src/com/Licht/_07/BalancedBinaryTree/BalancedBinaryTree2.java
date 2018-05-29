package com.Licht._07.BalancedBinaryTree;
import javax.swing.tree.TreeNode;

public class BalancedBinaryTree2 {
	public boolean isBalanced(TreeNode root){
		return maxDepth(root) != -1;
	}

	private int maxDepth(TreeNode root) {
		// TODO Auto-generated method stub
		if (root == null){
			return 0;
		}
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);
		if(left == -1||right == -1||Math.abs(left-right) > 1){
			return -1;
		}
		return Math.max(left,right) + 1;
	}
}
