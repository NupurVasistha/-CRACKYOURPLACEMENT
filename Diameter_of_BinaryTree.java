public class Diameter_of_BinaryTree {
    public static class Solution {
        private int diameter;

        public int diameterOfBinaryTree(TreeNode root) {
            diameter = 0;
            calculateDiameter(root);
            return diameter;
        }

        private int calculateDiameter(TreeNode node) {
            if (node == null) {
                return 0;
            }

            int leftDepth = calculateDiameter(node.left);
            int rightDepth = calculateDiameter(node.right);

            // Update the diameter at each node
            diameter = Math.max(diameter, leftDepth + rightDepth);

            // Return the depth of the subtree rooted at the current node
            return 1 + Math.max(leftDepth, rightDepth);
        }
    }
}
