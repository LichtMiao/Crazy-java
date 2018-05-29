package com.Licht._07.BalancedBinaryTree;

import javax.swing.tree.TreeNode;

/*
 * @param root: the root of binary tree
 * @return: true if this binary tree is balanced, or false
 */
public class BalancedBinaryTree1 {
	public boolean isBalanced(TreeNode root)
	{
		return helper(root).isBalanced;
	}

	private ResultType helper(TreeNode root) {
		// TODO Auto-generated method stub
		if (root==null){
			return new ResultType(true,0);
		}
		
		ResultType left = helper(root.left);
		ResultType right = helper(root.right);
		
		//subtree not balance
		if(!left.isBalanced||!right.isBalanced){
			return new ResultType(false,-1);
		}
		
		//root is not balance
		if(Math.abs(left.maxDepth - right.maxDepth) > 1){
			return new ResultType(false,-1);
		}
		
		//otherwise return the balanced tree's param
		return new ResultType(true,Math.max(left.maxDepth, right.maxDepth) + 1);
	}
}
