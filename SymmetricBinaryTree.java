
/* 
Coding Ninja Data Structure Skill test Question.

Symmetric Binary Tree
Given a binary tree, check whether it is symmetric around its center at every level. That means, return true if the given binary tree and its mirror is exactly same. Otherwise return false.
Input Format :
Nodes in level order form (separated by space). If any node does not have left or right child, take -1 in its place. 
Output Format :
Return true or false.
Constraints :
1 <= Number of Nodes <= 10^5
Sample Input 1 :
1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
Sample Output 1 :
false
Sample Input 2 :
1 2 2 3 4 4 3 -1 -1 -1 -1 -1 -1 -1 -1
Sample Output 2 :
true
Sample Input 3 :
1 2 2 -1 3 -1 3 -1 -1 -1 -1
Sample Output 3 :
false
 */ 


import java.util.*;

public class Solution {

    public static boolean isSymmetric(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return true;
        }
        return isSymmetricHelper(root.left, root.right);
    }

    private static boolean isSymmetricHelper(BinaryTreeNode<Integer> left, BinaryTreeNode<Integer> right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (!left.data.equals(right.data)) {
            return false;
        }
        return isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right, right.left);
    }

}
