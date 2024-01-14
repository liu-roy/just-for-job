package org.jayson.offer.tree;

import java.util.HashMap;

/**
 * 某二叉树的先序遍历结果记录于整数数组 preorder，
 * 它的中序遍历结果记录于整数数组 inorder。请根据 preorder 和 inorder 的提示构造出这棵二叉树并返回其根节点。
 *
 * 输入: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
 *
 * 输出: [3,9,20,null,null,15,7]
 */


/**
 * 解题思路
 * https://leetcode.cn/problems/zhong-jian-er-cha-shu-lcof/solutions/100091/mian-shi-ti-07-zhong-jian-er-cha-shu-di-gui-fa-qin/
 */
public class RebuildBiTree {

    HashMap<Integer, Integer> inMap = new HashMap<Integer, Integer>();
    int[] preorders;
    public TreeNode deduceTree(int[] preorder, int[] inorder) {


        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }
        preorders = preorder;
        return recurse(0, 0, inorder.length - 1);

    }

    /**
     *
     * @param indexLeft 左边界
     * @param prdRootIndex  根节点在pre中的索引下标
     * @param indexRight 右边界
     * @return
     */

    public TreeNode recurse(int indexLeft, int prdRootIndex,int indexRight) {
        if (indexLeft > indexRight) {
            return null;
        }
        TreeNode rootNode = new TreeNode(preorders[prdRootIndex]);
        Integer newRootIndex = inMap.get(preorders[prdRootIndex]);
        rootNode.left= recurse(indexLeft, prdRootIndex+1, newRootIndex - 1);
        rootNode.right = recurse(newRootIndex + 1, prdRootIndex+newRootIndex-indexLeft + 1, indexRight);
        return rootNode;
    }




    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
