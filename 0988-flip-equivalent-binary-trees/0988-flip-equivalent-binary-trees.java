class Solution {
    public boolean flipEquiv(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        } else if (node1 != null && node2 != null) {
            if (node1.val == node2.val) {
                if (flipEquiv(node1.left, node2.left) && flipEquiv(node1.right, node2.right)) {
                    return true;
                } else if (flipEquiv(node1.left, node2.right) && flipEquiv(node1.right, node2.left)) {
                    return true;
                }
            }
        }
        return false;
    }
}