package pp_BasedQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidateBST    {
	public static void main(String[] args) {
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(3);
        
        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(7);
        root2.right.left = new TreeNode(8);
        root2.right.right = new TreeNode(10);
        
        System.out.println(isValidBST(root1)); //true
        System.out.println(isValidBST(root2)); //false
    }

    public static boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }
    
    private static boolean isValidBST(TreeNode node, Integer lower, Integer upper) {
        if (node == null) {
            return true;
        }
        
        int val = node.val;
        if (lower != null && val <= lower) {
            return false;
        }
        if (upper != null && val >= upper) {
            return false;
        }
        
        if (!isValidBST(node.right, val, upper)) {
            return false;
        }
        if (!isValidBST(node.left, lower, val)) {
            return false;
        }
        
        return true;
    }
}
